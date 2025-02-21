package com.fareshare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

  @Autowired
  private SimpMessagingTemplate messagingTemplate;

  public void sendNotification(String userEmail, String message) {
    messagingTemplate.convertAndSendToUser(userEmail, "/queue/notifications", message);
  }
}