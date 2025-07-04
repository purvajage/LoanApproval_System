// service/LoanApprovalService.java
package com.loan.loanapproval.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loan.loanapproval.model.LoanApplication;
import com.loan.loanapproval.repository.LoanApplicationRepository;

@Service
public class LoanApprovalService {

    @Autowired
    private LoanApplicationRepository repository;

    private final String AI_API_URL = "http://localhost:5000/predict";

    public LoanApplication applyLoan(LoanApplication application) {
        Map<String, Object> request = new HashMap<>();
        request.put("Gender", application.getGender());
        request.put("Married", application.getMarried());
        request.put("Dependents", application.getDependents());
        request.put("Education", application.getEducation());
        request.put("Self_Employed", application.getSelfEmployed());
        request.put("ApplicantIncome", application.getApplicantIncome());
        request.put("CoapplicantIncome", application.getCoapplicantIncome());
        request.put("LoanAmount", application.getLoanAmount());
        request.put("Loan_Amount_Term", application.getLoanTerm());
        request.put("Credit_History", application.getCreditHistory());
        request.put("Property_Area", application.getPropertyArea());

        // Call AI Model API using RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        try {
            Map<?, ?> response = restTemplate.postForObject(AI_API_URL, request, Map.class);
            Boolean approved = (Boolean) response.get("loan_approved");
            application.setLoanApproved(approved);
        } catch (Exception e) {
            e.printStackTrace();
            application.setLoanApproved(null); // or false as fallback
        }

        return repository.save(application);
    }
}
