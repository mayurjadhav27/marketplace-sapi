package com.marketplacehub.marketplacesapi.controller;

import com.marketplacehub.marketplacesapi.data.User;
import com.marketplacehub.marketplacesapi.service.UserSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserSerive userSerive;

    @PostMapping("/saveUser")
     public ResponseEntity<?> saveUser(@RequestBody
                              User user) {
        if (userSerive.isUserExist(user.getEmailId())) {
            return new ResponseEntity<>("User Already Exists", HttpStatus.ALREADY_REPORTED);
        } else {
            User user1 = userSerive.saveUser(user);
            return new ResponseEntity<>(user1,HttpStatus.OK);
        }
    }

}
