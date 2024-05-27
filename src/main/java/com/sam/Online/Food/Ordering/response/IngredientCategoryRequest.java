package com.sam.Online.Food.Ordering.response;


import lombok.Data;

@Data
public class IngredientCategoryRequest {

    private String name;
    private Long restaurantId;
}
