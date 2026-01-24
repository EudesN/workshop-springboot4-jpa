package com.eudesnazario.springboot_api.repositories;

import com.eudesnazario.springboot_api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
