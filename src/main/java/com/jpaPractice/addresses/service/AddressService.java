package com.jpaPractice.addresses.service;

import com.jpaPractice.addresses.entity.AddressEntity;
import com.jpaPractice.addresses.entity.UserProfile;
import com.jpaPractice.addresses.exception.ResourceNotFoundException;
import com.jpaPractice.addresses.repository.AddressRepository;
import com.jpaPractice.addresses.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class AddressService {

    @Autowired
    AddressRepository repository;

    public AddressEntity saveAddress(AddressEntity entity) {
        String randomUserId = UUID.randomUUID().toString();
        entity.setId(randomUserId);
        return repository.save(entity);
    }

    public List<AddressEntity> getAddressById(String id) {
        return Collections.singletonList(repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ResourceNotFoundException : " + id)));

    }

    public List<AddressEntity> getAllAddress() {
        return repository.findAll();
    }

    public void deleteAddress(String id) {
        repository.deleteById(id);
    }

    public AddressEntity updateAddressId(AddressEntity addressEntity, String id) {
        return repository.save(addressEntity);
    }


    public List<AddressEntity> getAddressByPinCode(String pinCode) {
        return repository.getAddressByPinCode(pinCode);
    }

// user



    @Autowired
    UserRepo userRepo;

    AddressEntitywemdhjwebde2udb


    public UserProfile createUserProfile(UserProfile userProfile) {
        String randomUserId = UUID.randomUUID().toString();
        userProfile.setId(randomUserId);
        userProfile.setAddresses(Collections.singletonList(getAllAddress().get(0)));
        userProfile.setFirstName(userProfile.getFirstName());
        return userRepo.save(userProfile);
    }

    public List<AddressEntity> getAddressesByCity(String city) {
        return repository.getAddressByCity(city);
    }
}
