package com.shekhargulati.app.repository;

import com.shekhargulati.app.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//Annotation
@Repository

// Interface extending CrudRepository
public interface LocationRepository extends JpaRepository<Location, Integer> {


    @Query("SELECT L.name FROM Location L")
    List<String> getLocationNames();

    @Query("SELECT L FROM Location L WHERE LOWER(L.name) = LOWER(:name)")
    Location getDescriptionByName(String name);
}
