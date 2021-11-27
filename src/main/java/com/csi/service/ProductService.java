package com.csi.service;

import com.csi.model.Product;

import java.util.List;

public interface ProductService
{
    public void addData(Product product);

    public List<Product> fetchDataByAnyInput(Product product);
}
