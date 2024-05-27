package com.sam.Online.Food.Ordering.repository;

import com.sam.Online.Food.Ordering.model.IngredientsItem;
import com.sam.Online.Food.Ordering.service.IngredientsService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem,Long> {

    List<IngredientsItem> findByRestaurantId(Long id);

}
