package com.jpaPractice.addresses.repository;

import com.jpaPractice.addresses.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<AddressEntity,String> {

    public List<AddressEntity> getAddressByPinCode(String pinCode);

    public List<AddressEntity> getAddressByCity(String city);
}
