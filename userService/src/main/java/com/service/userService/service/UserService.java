package com.service.userService.service;

import com.service.userService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserService {

  User saveUser(User user);
  List<User> getAllUser();
  User getUser(String userId);
   String deleteUser(String userId);
   User updateUser(User user,String userId);

}
