package com.example.demo.request;

import lombok.Data;

import java.util.List;
@Data
public class AddCartItemRequest {

    private Long foodId;
    public int quantity;

    private List<String> ingredients;

}
