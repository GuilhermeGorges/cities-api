package com.guilherme.gorges.citiesapi.cities.controller;

import com.guilherme.gorges.citiesapi.cities.entity.City;
import com.guilherme.gorges.citiesapi.cities.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cities")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

    private CityService cityService;

    @GetMapping
    public Page<City> getCities(final Pageable pageable){
        return cityService.getCities(pageable);
    }
}
