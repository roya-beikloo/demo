package com.ecommerce.shop.repository;

import com.ecommerce.shop.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Roya Gh on 2/24/2021
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {

}