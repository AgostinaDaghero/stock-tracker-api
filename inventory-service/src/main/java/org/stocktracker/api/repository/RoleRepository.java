package org.stocktracker.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.stocktracker.api.model.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);
}
