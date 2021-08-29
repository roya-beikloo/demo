package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.ProductInOrder;
import com.ecommerce.shop.entity.User;

/**
 * Created Roya gh Stamps on 8/26/2021
 */
public interface ProductInOrderService {

    void update(String itemId, Integer quantity, User user);

    ProductInOrder findOne(String itemId, User user);
}
