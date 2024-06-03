package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.request.OrderRequest;

import java.util.List;

public interface OrderService {

    public Order createOrder(OrderRequest order, User user) throws Exception;

    public Order updateOrder(Long orderId,String orderStatus)throws Exception;

    public void deleteOrder(Long orderId)throws Exception;

    public List<Order> getUsersOrder(Long userId)throws Exception;

    public List<Order> getRestaurantOrder(Long restaurantId,String orderStatus) throws Exception;

}
