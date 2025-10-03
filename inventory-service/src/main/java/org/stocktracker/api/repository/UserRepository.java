package org.stocktracker.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stocktracker.api.model.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);
}
