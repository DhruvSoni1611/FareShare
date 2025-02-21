package com.fareshare.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  @Value("${razorpay.key.id}")
  private String razorpayKeyId;

  @Value("${razorpay.key.secret}")
  private String razorpayKeySecret;

  public String createPaymentOrder(double amount, String currency) throws RazorpayException {
    RazorpayClient razorpayClient = new RazorpayClient(razorpayKeyId, razorpayKeySecret);

    JSONObject orderRequest = new JSONObject();
    orderRequest.put("amount", amount * 100); // Amount in paise
    orderRequest.put("currency", currency);
    orderRequest.put("receipt", "order_receipt_1");

    Order order = razorpayClient.orders.create(orderRequest); // Correct usage
    return order.get("id");
  }
}