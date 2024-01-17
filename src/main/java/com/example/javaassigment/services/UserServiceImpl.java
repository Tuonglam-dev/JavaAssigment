package com.example.javaassigment.services;

import com.example.javaassigment.models.UserEntity;
import com.example.javaassigment.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
  @Autowired
  private IUserRepository userRepository;

  @Override
  public List<UserEntity> GetAllUser() {
    return this.userRepository.findAll();
  }

  @Override
  public UserEntity GetDetailUser(long Id) {
    return this.userRepository.findById(Id).orElse(null);
  }

  @Override
  public UserEntity CreateUser(UserEntity user) {
    return this.userRepository.save(user);
  }

  @Override
  public UserEntity UpdateUser(UserEntity user, long id) {
    if (this.userRepository.existsById(id)) {
      return this.userRepository.save(user);
    }
    return null;
  }

  @Override
  public void DeleteUser(long id) {
    this.userRepository.deleteById(id);
  }
}
