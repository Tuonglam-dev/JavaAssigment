package com.example.javaassigment.controllers;

import com.example.javaassigment.models.UserEntity;
import com.example.javaassigment.services.IUserService;
import com.example.javaassigment.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/User")
public class UserController {
  @Autowired
  IUserService userService;

  @GetMapping
  public List<UserEntity> getAllUser () {
    return userService.GetAllUser();
  }

  @GetMapping("/{id}")
  public UserEntity getUserDetail (@PathVariable long id) {
    return userService.GetDetailUser(id);
  }

  @PostMapping
  public UserEntity createUser (@RequestBody UserEntity user) {
    System.out.println(user);
    return userService.CreateUser(user);
  }

  @PutMapping("/{id}")
  public UserEntity updateUser (@PathVariable long id, @RequestBody UserEntity user) {
    return userService.UpdateUser(user, id);
  }

  @DeleteMapping("/{id}")
  public void DeleteUser (@PathVariable long id) {
    userService.DeleteUser(id);
  }
}
