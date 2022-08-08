import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Location } from '../location';
import { environment } from './../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LocationService {

  private baseUrl = 'http://localhost:8080/api/';
  private weatherApiUrl = environment.weatherApiUrl;
  private weatherApiKey = environment.weatherApiKey;

  constructor(private http: HttpClient) {
  }

  getNames(): Observable<string[]> {
    return this.http.get<string[]>(`${this.baseUrl}` + 'names');
  }

  getDescription(name: string): Observable<Location> {
    return this.http.get<Location>(`${this.baseUrl}` + 'description/' + name);
  }

  getCurrentWeather(name: string): Observable<any> {
    return this.http.get<any>(`${this.weatherApiUrl}` + 'current.json?key=' + `${this.weatherApiKey}` + '&q=' + name + '&aqi=no');
  }
}
