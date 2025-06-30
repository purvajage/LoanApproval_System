// service/AuthService.java
package com.loan.loanapproval.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.loan.loanapproval.model.User;
import com.loan.loanapproval.repository.UserRepository;
import com.loan.loanapproval.security.JwtUtil;

@Service
public class AuthService {

    @Autowired private UserRepository userRepo;
    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private JwtUtil jwtUtil;

   public String register(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));

    // Set default role if not provided
    if (user.getRole() == null) {
        user.setRole("ROLE_USER");
    }

    userRepo.save(user);
    return "User registered with role: " + user.getRole();
}


    public String login(User user) {
        Optional<User> optional = userRepo.findByUsername(user.getUsername());
        if (optional.isPresent() && passwordEncoder.matches(user.getPassword(), optional.get().getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        }
        throw new RuntimeException("Invalid credentials");
    }
    
}
