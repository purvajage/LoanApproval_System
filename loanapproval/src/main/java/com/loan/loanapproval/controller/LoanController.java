
package com.loan.loanapproval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.loan.loanapproval.model.LoanApplication;
import com.loan.loanapproval.service.LoanApprovalService;
@RestController
@RequestMapping("/api/loans")
@CrossOrigin
public class LoanController {
    @Autowired
    private LoanApprovalService service;
    @PostMapping("/apply")
    public LoanApplication apply(@RequestBody LoanApplication application) {
        return service.applyLoan(application);
    }
}
