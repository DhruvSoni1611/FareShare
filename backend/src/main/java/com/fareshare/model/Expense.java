package com.fareshare.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "expenses")
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Double amount;

  @Column
  private String description;

  @Column(nullable = false)
  private String category; // e.g., food, travel, hotel, misc

  @ManyToOne
  @JoinColumn(name = "paid_by", nullable = false)
  private User paidBy;

  @ManyToOne
  @JoinColumn(name = "trip_id", nullable = false)
  private Trip trip;
}