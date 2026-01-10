package com.eudesnazario.springboot_api.repositories;

import com.eudesnazario.springboot_api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
