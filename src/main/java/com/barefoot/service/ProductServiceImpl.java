package com.barefoot.service;

import com.barefoot.model.Product;
import com.barefoot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductServiceImpl() {
        System.out.println("ProductServiceImpl no args cont");
    }

    /**
     * Spring bean life cycle
     */
    @PostConstruct
    private void initialize(){
        System.out.println("initialize after constructor");
    }

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        System.out.println("ProductServiceImpl repository const");
        this.repository = repository;
    }


    public void setRepository(ProductRepository repository) {
        System.out.println("ProductServiceImpl  repository setter");
        this.repository = repository;
    }
    @Override
    public List<Product> findAll() {

        return repository.findAll();
    }
}
