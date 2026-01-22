package com.eudesnazario.springboot_api.repositories;

import com.eudesnazario.springboot_api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
