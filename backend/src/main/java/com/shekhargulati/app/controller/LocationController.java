package com.shekhargulati.app.controller;

import com.shekhargulati.app.domain.Location;
import com.shekhargulati.app.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("names")
    public List<String> getLocationNames() {
        return locationService.getLocationNames();
    }

    @GetMapping("description/{name}")
    public Location getDescriptionByName(@PathVariable("name") String name) {
        return locationService.getDescriptionByName(name);
    }

}
