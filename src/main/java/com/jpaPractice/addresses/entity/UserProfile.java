package com.jpaPractice.addresses.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.logging.FileHandler;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class UserProfile {

    @Id
    public String id;
    public String firstName;
    public String email;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userProfile")
    public List<AddressEntity> addresses;

}
