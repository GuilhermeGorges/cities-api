package com.guilherme.gorges.citiesapi.states.service;

import com.guilherme.gorges.citiesapi.states.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateService {

    private StateRepository stateRepository;


}
