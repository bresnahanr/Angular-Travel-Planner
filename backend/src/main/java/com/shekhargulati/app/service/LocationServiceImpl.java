package com.shekhargulati.app.service;

import com.shekhargulati.app.domain.Location;
import com.shekhargulati.app.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<String> getLocationNames() {
        return locationRepository.getLocationNames();
    }

    @Override
    public Location getDescriptionByName(String name) {
        return locationRepository.getDescriptionByName(name);
    }

}
