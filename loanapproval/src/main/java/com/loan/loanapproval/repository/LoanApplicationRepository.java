// repository/LoanApplicationRepository.java
package com.loan.loanapproval.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.loanapproval.model.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
}
