package com.fareshare.repository;

import com.fareshare.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TripRepository extends JpaRepository<Trip, Long> {
  List<Trip> findByCreatedByEmail(String email);
}