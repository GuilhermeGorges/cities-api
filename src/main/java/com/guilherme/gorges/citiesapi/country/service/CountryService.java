package com.guilherme.gorges.citiesapi.country.service;

import com.guilherme.gorges.citiesapi.country.entity.Country;
import com.guilherme.gorges.citiesapi.country.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> listAll(Pageable page) {
        return countryRepository.findAll(page);
    }

    public ResponseEntity<? extends Object> getOne(Long id) {
        Optional<Country> countryOptional = countryRepository.findById(id);
        if (countryOptional.isPresent()) {
            return ResponseEntity.ok().body(countryRepository.findById(id));
        }
        return ResponseEntity.notFound().build();
    }
}

