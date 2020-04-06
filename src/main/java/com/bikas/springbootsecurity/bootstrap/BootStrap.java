package com.bikas.springbootsecurity.bootstrap;

import com.bikas.springbootsecurity.model.User;
import com.bikas.springbootsecurity.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BootStrap implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = User.builder()
                .userName("user")
                .password("pass")
                .roles("ROLE_USER")
                .active(true)
                .build();

        userRepository.save(user1);

        User user2 = User.builder()
                .userName("admin")
                .password("pass")
                .roles("ROLE_ADMIN")
                .active(true)
                .build();

        userRepository.save(user2);
    }
}
