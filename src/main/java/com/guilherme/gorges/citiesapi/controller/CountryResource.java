package com.guilherme.gorges.citiesapi.controller;

import com.guilherme.gorges.citiesapi.entity.Country;
import com.guilherme.gorges.citiesapi.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository countryRepository;

    @GetMapping
    public List<Country> countries() {
        return countryRepository.findAll();
    }
}
