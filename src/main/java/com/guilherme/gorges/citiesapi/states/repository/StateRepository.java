package com.guilherme.gorges.citiesapi.states.repository;


import com.guilherme.gorges.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
