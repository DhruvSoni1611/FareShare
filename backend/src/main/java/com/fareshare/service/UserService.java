package com.fareshare.service;

import com.fareshare.dto.UserDTO;
import com.fareshare.model.User;
import com.fareshare.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public User registerUser(UserDTO userDTO) {
    User user = new User();
    user.setEmail(userDTO.getEmail());
    user.setPassword(passwordEncoder.encode(userDTO.getPassword())); // Encode the password
    user.setName(userDTO.getName());
    user.setProfilePicture(userDTO.getProfilePicture());
    return userRepository.save(user);
  }
}