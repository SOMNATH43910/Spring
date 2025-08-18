package com.amazon.cart.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amazon.cart.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // CRUD methods auto milenge (save, findAll, findById, delete etc.)
}
