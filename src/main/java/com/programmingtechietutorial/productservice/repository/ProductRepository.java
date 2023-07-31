package com.programmingtechietutorial.productservice.repository;

import com.programmingtechietutorial.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
