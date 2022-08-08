package com.shekhargulati.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "location")
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @Id
    private int id;
    private String name;
    private String description;
}
