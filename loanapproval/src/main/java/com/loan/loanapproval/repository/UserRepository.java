// repository/UserRepository.java
package com.loan.loanapproval.repository;

import com.loan.loanapproval.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
