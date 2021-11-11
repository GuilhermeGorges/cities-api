package com.guilherme.gorges.citiesapi.states.controller;

import com.guilherme.gorges.citiesapi.states.entity.State;
import com.guilherme.gorges.citiesapi.states.service.StateService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StateController {

    private StateService stateService;

    @GetMapping
    public List<State> listState(){
        return stateService.listStates();
    }



}
