package com.guilherme.gorges.citiesapi.states.service;

import com.guilherme.gorges.citiesapi.states.entity.State;
import com.guilherme.gorges.citiesapi.states.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateService {

    private final StateRepository stateRepository;

    public List<State> listStates() {
        return stateRepository.findAll();
    }

}
