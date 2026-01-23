package com.eudesnazario.springboot_api.repositories;

import com.eudesnazario.springboot_api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
