package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.OrderMain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created Roya gh Stamps on 8/26/2021
 */
public interface OrderService {
    Page<OrderMain> findAll(Pageable pageable);

    Page<OrderMain> findByStatus(Integer status, Pageable pageable);

    Page<OrderMain> findByBuyerEmail(String email, Pageable pageable);

    Page<OrderMain> findByBuyerPhone(String phone, Pageable pageable);

    OrderMain findOne(Long orderId);

    OrderMain finish(Long orderId);

    OrderMain cancel(Long orderId);
}
