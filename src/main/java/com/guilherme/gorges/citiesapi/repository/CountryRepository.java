package com.guilherme.gorges.citiesapi.repository;

import com.guilherme.gorges.citiesapi.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CountryRepository extends JpaRepository<Country, Long> {
}
