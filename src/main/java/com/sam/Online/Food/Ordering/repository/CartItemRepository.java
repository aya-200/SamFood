package com.sam.Online.Food.Ordering.repository;

import com.sam.Online.Food.Ordering.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {


}
