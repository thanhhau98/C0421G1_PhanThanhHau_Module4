package com.codegym.model.service;

import com.codegym.model.bean.Product;
import com.codegym.model.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService  implements IProductService{

    @Autowired
     private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }
}
