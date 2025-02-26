package com.example.demo.controller;


import com.example.demo.dto.RestaurantDto;
import com.example.demo.model.Restaurant;
import com.example.demo.model.User;
import com.example.demo.response.CreateRestaurantRequest;
import com.example.demo.service.RestaurantService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private UserService userService;

    @GetMapping("/search")
    public ResponseEntity<List<Restaurant>> searchRestaurant(@RequestHeader("Authorization")String jwt, @RequestParam String keyword) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Restaurant> restaurant=restaurantService.searchRestaurant(keyword);

        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Restaurant>> searchRestaurant(@RequestHeader("Authorization")String jwt) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        List<Restaurant> restaurant=restaurantService.getAllRestaurant();
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> findByRestaurantId(@RequestHeader("Authorization")String jwt,@PathVariable Long id) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.getRestaurantByUserId(id);
        return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/add-favorites")
    public ResponseEntity<RestaurantDto> addToFavorites(@RequestHeader("Authorization")String jwt,@PathVariable Long id) throws Exception {
        User user=userService.findUserByJwtToken(jwt);
        RestaurantDto restaurant=restaurantService.addToFavorites(id,user);
        return new ResponseEntity<>(restaurant, HttpStatus.OK);
    }


}
