package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Food;
import com.example.demo.model.Restaurant;
import com.example.demo.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);


    void deleteFood(Long foodId)throws Exception;

    public List<Food> getRestaurantFood(Long restaurantId,boolean isVegetarian,boolean isNonVeg,boolean isSeasonal,String foodCategory);

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId)throws Exception;
    public Food updateAvailabilityStatus(Long foodId)throws Exception;
}
