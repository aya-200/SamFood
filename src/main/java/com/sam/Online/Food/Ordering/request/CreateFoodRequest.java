package com.sam.Online.Food.Ordering.request;


import com.sam.Online.Food.Ordering.model.Category;
import com.sam.Online.Food.Ordering.model.IngredientCategory;
import com.sam.Online.Food.Ordering.model.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {

    private String name ;
    private String description ;
    private Long price ;


    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarin;
    private boolean seasional;
    private List<IngredientsItem> ingredients;

}
