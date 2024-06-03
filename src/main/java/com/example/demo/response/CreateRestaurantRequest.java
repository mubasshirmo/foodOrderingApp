package com.example.demo.response;

import com.example.demo.model.Address;
import com.example.demo.model.ContactInformation;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {

    private Long id;
    private String name;
    private String description;
    private String cuisineType;
    private Address address;
    private ContactInformation contactInformation;
    private String opiningHours;
    private List<String> images;
}
