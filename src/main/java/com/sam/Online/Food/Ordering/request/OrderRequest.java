package com.sam.Online.Food.Ordering.request;


import com.sam.Online.Food.Ordering.model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}
