package com.guilherme.gorges.citiesapi.countries.repository;

import com.guilherme.gorges.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}
