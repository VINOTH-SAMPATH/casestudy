/*
 * Copyright (c) Tata Consultancy Services. All Rights Reserved.
 * ============================================================
 */
package com.tcs.nawax.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.tcs.nawax.model.Region;

/**
 * Implementation of Region service to return list of cities for the region
 * 
 * @author Saranya
 * */
@Service
public class RegionServiceImpl implements RegionService {

    @Override
    public Region getCities(final String region) {
        Region regionModel = new Region();
        if (!StringUtils.isEmpty(region)) {
            if (region.equalsIgnoreCase("north")) {
                regionModel.setCities(Arrays.asList("Helsinki", "Oslo", "Stockholm", "Copenehagen"));
            } 
            else if (region.equalsIgnoreCase("south")) {
                regionModel.setCities(Arrays.asList("Barcelona", "Rome", "Athens"));
            }
        }
        return regionModel;
    }
}