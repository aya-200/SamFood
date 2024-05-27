package com.sam.Online.Food.Ordering.repository;

import com.sam.Online.Food.Ordering.model.OrderItem;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
