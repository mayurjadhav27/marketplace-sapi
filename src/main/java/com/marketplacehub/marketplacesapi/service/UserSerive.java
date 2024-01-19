package com.marketplacehub.marketplacesapi.service;

import com.marketplacehub.marketplacesapi.data.User;

public interface UserSerive {

    public User saveUser(User user);

    boolean isUserExist(String emailId);
}
