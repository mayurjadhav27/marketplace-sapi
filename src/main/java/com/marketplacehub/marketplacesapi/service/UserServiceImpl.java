package com.marketplacehub.marketplacesapi.service;

import com.marketplacehub.marketplacesapi.data.User;
import com.marketplacehub.marketplacesapi.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerive{

    @Autowired
    UserRepo userRepo;
    @Override
    public User saveUser(User user) {
      return userRepo.save(user);
    }

    @Override
    public boolean isUserExist(String emailId) {
       return userRepo.existsById(emailId);
    }
}
