package com.guilherme.gorges.citiesapi.cities.service;

import com.guilherme.gorges.citiesapi.cities.entity.City;
import com.guilherme.gorges.citiesapi.cities.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {

    private final CityRepository cityRepository;

/*    //1st
    public List<City> getCities(){
        return cityRepository.findAll();
    }*/

    //2nd
    public Page<City> getCities(final Pageable pageable){
        return cityRepository.findAll(pageable);
    }

}
