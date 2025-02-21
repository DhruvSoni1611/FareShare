package com.fareshare.controller;

import com.fareshare.model.Expense;
import com.fareshare.model.Trip;
import com.fareshare.model.User;
import com.fareshare.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

  @Autowired
  private ExpenseService expenseService;

  @PostMapping
  public Expense addExpense(@RequestBody Expense expense, @AuthenticationPrincipal User user,
      @RequestParam Long tripId) {
    Trip trip = new Trip();
    trip.setId(tripId);
    return expenseService.addExpense(expense, user, trip);
  }

  @GetMapping
  public List<Expense> getExpenses(@RequestParam Long tripId) {
    Trip trip = new Trip();
    trip.setId(tripId);
    return expenseService.getExpensesByTrip(trip);
  }
}