package org.stocktracker.api.security;

import org.stocktracker.api.model.User;
import org.stocktracker.api.repository.UserRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Load user from the database using email as identifier.
     * Spring Security automatically calls this method during authentication.
     */
    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found"));

        return org.springframework.security.core.userdetails.User
                .builder()
                //We use email as the username for authentication
                .username(user.getEmail())
                .password(user.getPassword())
                //Convert the entity role to Spring Authority
                .authorities(user.getRole().getRoleName())
                .disabled(!user.getActive())
                .build();
    }
}