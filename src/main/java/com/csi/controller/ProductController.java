package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    ProductService productServiceimpl;

    @PostMapping("/adddata")
    public ResponseEntity<String> addData(@RequestBody Product product)
    {
        productServiceimpl.addData(product);

        return ResponseEntity.ok("Data Saved Successfully");
    }

    @PostMapping("/fetchdatabyusinganyinput")
    public ResponseEntity<List<Product>> fetchDataByUsingAnyInput(@RequestBody Product product)
    {
        return ResponseEntity.ok(productServiceimpl.fetchDataByAnyInput(product));
    }

}
