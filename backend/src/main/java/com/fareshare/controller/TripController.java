package com.fareshare.controller;

import com.fareshare.model.Trip;
import com.fareshare.model.User;
import com.fareshare.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trips")
public class TripController {

  @Autowired
  private TripService tripService;

  @PostMapping
  public Trip createTrip(@RequestBody Trip trip, @AuthenticationPrincipal User user) {
    return tripService.createTrip(trip, user);
  }

  @GetMapping
  public List<Trip> getTrips(@AuthenticationPrincipal User user) {
    return tripService.getTripsByUser(user);
  }
}