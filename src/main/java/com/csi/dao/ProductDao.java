package com.csi.dao;

import com.csi.model.Product;

import java.util.List;

public interface ProductDao
{
    public void addData(Product product);

    public List<Product> fetchDataByAnyInput(Product product);

}
