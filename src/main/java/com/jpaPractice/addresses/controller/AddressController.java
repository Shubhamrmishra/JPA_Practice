package com.jpaPractice.addresses.controller;

import com.jpaPractice.addresses.entity.AddressEntity;
import com.jpaPractice.addresses.entity.UserProfile;
import com.jpaPractice.addresses.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressService service;


    @PostMapping("/")
    public AddressEntity saveAddress(@RequestBody AddressEntity entity){
        return service.saveAddress(entity);
    }


    @GetMapping("/{id}")
    public AddressEntity getAddressById(@PathVariable String id){
        return (AddressEntity) service.getAddressById(id);
    }

    @GetMapping("/")
    public List<AddressEntity> getAllAddress(){
        return service.getAllAddress();
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable String id){
       service.deleteAddress(id);
    }
    @PutMapping("/{id}")
    public AddressEntity updateAddressId(@RequestBody AddressEntity addressEntity, @PathVariable String id){
        return service.updateAddressId(addressEntity,id);
    }

    @GetMapping("/pin/{pinCode}")
    public List<AddressEntity> getAddressByPinCode(@PathVariable String pinCode) {
        return service.getAddressByPinCode(pinCode);
    }

    @GetMapping("/city/{city}")
    public List<AddressEntity> getAddressesByCity(@PathVariable String city){
        return service.getAddressesByCity(city);
    }

        // user profile


    @PostMapping("/user")
    public UserProfile createUserProfile(@RequestBody UserProfile userProfile){
        return service.createUserProfile(userProfile);
    }





}
