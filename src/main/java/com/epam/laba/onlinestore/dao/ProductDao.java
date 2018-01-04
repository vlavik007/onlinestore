package com.epam.laba.onlinestore.dao;

import com.epam.laba.onlinestore.model.Product;

import java.util.List;

public interface ProductDao {

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void removeProduct(int id);

    public Product getProductById(int id);

    public List<Product> listProducts();
}
