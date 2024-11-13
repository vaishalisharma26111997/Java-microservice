package com.service.userService.controller;

import com.service.userService.entities.User;
import com.service.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserService userService;
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user)
{
    User user1=userService.saveUser(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(user1);
}
@GetMapping
public ResponseEntity<List<User>>getAllUser()
{
    List<User> users=userService.getAllUser();
   return ResponseEntity.ok(users);

}
    @GetMapping("/{userId}")
    public ResponseEntity<User>getUser(@PathVariable String userId)
    {
        User users=userService.getUser(userId);
        return ResponseEntity.ok(users);

    }
}