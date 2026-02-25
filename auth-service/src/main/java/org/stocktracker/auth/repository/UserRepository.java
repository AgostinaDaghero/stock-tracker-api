package org.stocktracker.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stocktracker.auth.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
