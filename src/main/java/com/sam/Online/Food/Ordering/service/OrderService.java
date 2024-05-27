package com.sam.Online.Food.Ordering.service;

import com.sam.Online.Food.Ordering.model.Order;
import com.sam.Online.Food.Ordering.model.User;
import com.sam.Online.Food.Ordering.request.OrderRequest;

import java.util.List;

public interface OrderService {

    public Order createOrder(OrderRequest order , User user) throws Exception;

    public Order updateOrder(Long orderId, String orderStatus) throws Exception;

    public void calculOrder(Long orderId) throws Exception;

    public List<Order> getUsersOrder(Long userId) throws Exception;
    public List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus) throws Exception;
    public Order findOrderById(Long orderId) throws Exception;
}
