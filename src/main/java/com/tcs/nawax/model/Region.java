/*
 * Copyright (c) Tata Consultancy Services. All Rights Reserved.
 * ============================================================
 */
package com.tcs.nawax.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds region information
 * 
 * @author Saranya
 * */
public class Region {

    private List<String> cities;

    /**
     * Default constructor sets empty cities
     * */
    public Region() {
        cities = new ArrayList<>();
    }

    /**
     * Returns list of cities of a region
     * 
     * @return the list list of cities of region
     * */
    public List<String> getCities() {
        return cities;
    }

    /**
     * Setting list of cities of a region
     * 
     * */
    public void setCities(final List<String> cities) {
        this.cities = cities;
    }

}
