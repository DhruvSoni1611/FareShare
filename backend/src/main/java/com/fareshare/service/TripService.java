package com.fareshare.service;

import com.fareshare.model.Trip;
import com.fareshare.model.User;
import com.fareshare.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

  @Autowired
  private TripRepository tripRepository;

  public Trip createTrip(Trip trip, User createdBy) {
    trip.setCreatedBy(createdBy);
    return tripRepository.save(trip);
  }

  public List<Trip> getTripsByUser(User user) {
    return tripRepository.findByCreatedByEmail(user.getEmail());
  }
}
