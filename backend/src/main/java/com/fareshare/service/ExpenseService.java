package com.fareshare.service;

import com.fareshare.model.Expense;
import com.fareshare.model.Trip;
import com.fareshare.model.User;
import com.fareshare.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

  @Autowired
  private ExpenseRepository expenseRepository;

  @Autowired
  private NotificationService notificationService;

  public Expense addExpense(Expense expense, User paidBy, Trip trip) {
    expense.setPaidBy(paidBy);
    expense.setTrip(trip);
    Expense savedExpense = expenseRepository.save(expense);

    // Send notification to all trip members
    String message = "New expense added: " + savedExpense.getDescription();
    trip.getMembers().forEach(member -> notificationService.sendNotification(member.getEmail(), message));

    return savedExpense;
  }

  public List<Expense> getExpensesByTrip(Trip trip) {
    return expenseRepository.findByTripId(trip.getId());
  }
}