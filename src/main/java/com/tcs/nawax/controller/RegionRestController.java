/*
 * Copyright (c) Tata Consultancy Services. All Rights Reserved.
 * ============================================================
 */
package com.tcs.nawax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.nawax.model.Region;
import com.tcs.nawax.service.RegionService;

/**
 * Region rest service to provide cities of region
 * 
 * @author Saranya
 * */
@RestController
public class RegionRestController {

    @Autowired
    private RegionService regionService;

    /**
     * Rest Service to get cities for provided region
     * 
     * @return list of cities for provided region
     * */
    @RequestMapping(value = "getCities", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Region getCities(final String region) {
        return regionService.getCities(region);
    }

}