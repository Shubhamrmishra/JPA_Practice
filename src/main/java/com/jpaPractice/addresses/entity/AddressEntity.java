package com.jpaPractice.addresses.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="address")
public class AddressEntity {

    @Id
    private String  id;
    private String fullName;
    private long mobileNumber;
    private String flatNo;
    private String building;
    private String area;
    private String city;
    private String pinCode;
    private boolean defaultAddress;





    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    public UserProfile userProfile;
}
