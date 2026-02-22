package org.stocktracker.api.config;

import org.stocktracker.api.model.Role;
import org.stocktracker.api.model.User;
import org.stocktracker.api.repository.RoleRepository;
import org.stocktracker.api.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(UserRepository userRepository,
                               RoleRepository roleRepository,
                               PasswordEncoder passwordEncoder) {

        return args -> {

            //Create a role if it doesn't exist
            Role roleAdmin = roleRepository.findByRoleName("ROLE_ADMIN")
                    .orElseGet(() -> roleRepository.save(
                            Role.builder()
                                    .roleName("ROLE_ADMIN")
                                    .build()
                    ));

            //Create a user if it doesn't exist
            userRepository.findByEmail("admin@email.com")
                    .orElseGet(() -> userRepository.save(
                            User.builder()
                                    .name("Admin")
                                    .email("admin@email.com")
                                    .password(passwordEncoder.encode("admin123"))
                                    .role(roleAdmin)
                                    .canAddStock(true)
                                    .active(true)
                                    .build()
                    ));
        };
    }
}
