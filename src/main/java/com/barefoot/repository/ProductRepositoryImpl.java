package com.barefoot.repository;

import com.barefoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private Calendar cal;

    //Special Expression Language
    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    @Override
    public List<Product> findAll(){
        List<Product> products = new ArrayList<Product>();

        Product product = new Product();

        product.setName("test name");
        product.setDescription("test desc");
        product.setSeedNum(seedNum);
        System.out.println("cal: " + cal.getTime());

        products.add(product);

        return products;
    }
}
