package com.guilherme.gorges.citiesapi.cities.repository;


import com.guilherme.gorges.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
