package com.eudesnazario.springboot_api.repositories;

import com.eudesnazario.springboot_api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
