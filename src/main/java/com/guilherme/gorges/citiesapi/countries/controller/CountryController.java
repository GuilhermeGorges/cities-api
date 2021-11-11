package com.guilherme.gorges.citiesapi.countries.controller;

import com.guilherme.gorges.citiesapi.countries.entity.Country;
import com.guilherme.gorges.citiesapi.countries.service.CountryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/countries")
public class CountryController {

    private CountryService countryService;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return countryService.listAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        return countryService.getOne(id);
    }
}
