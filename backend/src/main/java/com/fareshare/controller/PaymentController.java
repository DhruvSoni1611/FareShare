package com.fareshare.controller;

import com.fareshare.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @PostMapping("/create-order")
  public String createPaymentOrder(@RequestParam double amount, @RequestParam String currency) {
    try {
      return paymentService.createPaymentOrder(amount, currency);
    } catch (Exception e) {
      e.printStackTrace();
      return "Error creating payment order";
    }
  }
}