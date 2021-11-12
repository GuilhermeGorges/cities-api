package com.guilherme.gorges.citiesapi.distances.controller;
import com.guilherme.gorges.citiesapi.distances.service.DistanceService;
import com.guilherme.gorges.citiesapi.distances.service.EarthRadius;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceController {

    private final DistanceService distanceService;
    Logger log = LoggerFactory.getLogger(DistanceController.class);

    public DistanceController(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    @GetMapping("/by-points")
    public ResponseEntity byPoints(@RequestParam(name = "from") final Long city1,
                                   @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return ResponseEntity.ok().body(distanceService.distanceByPointsInMiles(city1, city2));
    }

    @GetMapping("/by-cube")
    public ResponseEntity byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("byCube");
        return  ResponseEntity.ok().body(distanceService.distanceByCubeInMeters(city1, city2));
    }

    @GetMapping("/by-math")
    public ResponseEntity byMath(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2,
                         @RequestParam final EarthRadius unit) {
        log.info("byMath");
        return ResponseEntity.ok().body(distanceService.distanceUsingMath(city1, city2, unit));
    }
}