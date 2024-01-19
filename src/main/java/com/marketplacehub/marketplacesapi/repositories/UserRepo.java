package com.marketplacehub.marketplacesapi.repositories;

import com.marketplacehub.marketplacesapi.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String>{}
