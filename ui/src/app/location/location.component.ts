import { Component, OnInit } from '@angular/core';
import {LocationService} from './location.service';
import { Location } from '../location';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {

  locations: Location[];
  names: string[];
  selection: Location;
  currentWeather: any;

  constructor(private locationService: LocationService) { }

  ngOnInit(): void {
    this.locationService.getNames().subscribe((data: string[]) => {
      this.names = data;
    });
  }

  updateSelection(newValue) {
    this.locationService.getDescription(newValue).subscribe((data: Location) => {
      this.selection = data;
    });
    this.locationService.getCurrentWeather(newValue).subscribe((data2: any) => {
      console.log(data2);
      this.currentWeather = data2;
    });
  }

}
