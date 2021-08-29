package com.ecommerce.shop.service;

import com.ecommerce.shop.entity.ProductCategory;

import java.util.List;

/**
 * Created Roya gh Stamps on 8/26/2021
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
