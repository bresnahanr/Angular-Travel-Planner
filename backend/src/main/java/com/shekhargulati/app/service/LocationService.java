package com.shekhargulati.app.service;

import com.shekhargulati.app.domain.Location;

import java.util.List;

public interface LocationService {

    List<String> getLocationNames();

    Location getDescriptionByName(String name);
}
