package com.csi.dao;

import com.csi.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDaoImpl implements  ProductDao
{
    private  static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void addData(Product product)
    {
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(product);

        transaction.commit();

    }

    @Override
    public List<Product> fetchDataByAnyInput(Product product)
    {
        Session session = factory.openSession();

        List<Product> prodlist = new ArrayList<>();

        List<Product> productList = session.createQuery("from Product").list();

        for (Product p : productList)
        {
            if (p.getProdId() == product.getProdId() || p.getProdName().equals(product.getProdName()) || p.getProdNumber() == product.getProdNumber() || p.getProdPrice() == product.getProdPrice() || p.getProdManufacturingDate().equals(product.getProdManufacturingDate()) || p.getProdEmail().equals(product.getProdEmail()))
            {
                prodlist.add(p);
            }
        }
        return prodlist;
    }
}
