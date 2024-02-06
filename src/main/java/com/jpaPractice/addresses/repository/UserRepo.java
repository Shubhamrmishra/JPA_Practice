package com.jpaPractice.addresses.repository;

import com.jpaPractice.addresses.entity.AddressEntity;
import com.jpaPractice.addresses.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserProfile,String> {



}
