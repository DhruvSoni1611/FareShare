package com.fareshare.controller;

import com.fareshare.dto.UserDTO;
import com.fareshare.model.User;
import com.fareshare.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/signup")
  public User registerUser(@RequestBody UserDTO userDTO) {
    return userService.registerUser(userDTO);
  }
}