package com.pfizer.datastructures.service;

import com.pfizer.datastructures.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getFiveMostExpensiveProducts();

    double getTotalPriceByColor(String color);

    String getMostExpensiveProductByName();

    List<String> getProductColors();


}
