package com.guilherme.gorges.citiesapi.country.repository;

import com.guilherme.gorges.citiesapi.country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}
