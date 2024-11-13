package com.service.userService.service.impl;

import com.service.userService.entities.User;
import com.service.userService.repository.UserRepository;
import com.service.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.userService.exception.ResourceNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        String userId=UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user with this is ID "+ userId+"not found"));
    }

    @Override
    public String deleteUser(String userId) {
        userRepository.deleteById(userId);
        return "user deleted";
    }

    @Override
    public User updateUser(User user,String userId) {

        return userRepository.save(user);
    }
}
