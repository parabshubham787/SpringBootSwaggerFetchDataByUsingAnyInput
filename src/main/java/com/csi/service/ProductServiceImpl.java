package com.csi.service;

import com.csi.dao.ProductDao;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService
{
    @Autowired
    ProductDao productDaoimpl;

    @Override
    public void addData(Product product)
    {
        productDaoimpl.addData(product);
    }

    @Override
    public List<Product> fetchDataByAnyInput(Product product)
    {
        return productDaoimpl.fetchDataByAnyInput(product);
    }
}
