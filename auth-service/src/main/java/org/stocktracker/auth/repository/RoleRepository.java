package org.stocktracker.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stocktracker.auth.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);
}
