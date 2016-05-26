/*
 * Copyright (c) Tata Consultancy Services. All Rights Reserved.
 * ============================================================
 */

package com.tcs.nawax.service;

import com.tcs.nawax.model.Region;

/**
 * Region service to return list of cities for the region
 * 
 * @author Saranya
 * */
public interface RegionService {

    /**
     * Method used to return list of cities for specified region
     * 
     * @param region the region
     * @return the list of cities for the region
     * */
    public Region getCities(String region);

}
