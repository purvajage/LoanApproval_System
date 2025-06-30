// model/LoanApplication.java
package com.loan.loanapproval.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int gender;
    private int married;
    private int dependents;
    private int education;
    private int selfEmployed;

    private int applicantIncome;
    private int coapplicantIncome;
    private int loanAmount;
    private int loanTerm;
    private int creditHistory;
    private int propertyArea;

    private Boolean loanApproved;
    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return int return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return int return the married
     */
    public int getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(int married) {
        this.married = married;
    }

    /**
     * @return int return the dependents
     */
    public int getDependents() {
        return dependents;
    }

    /**
     * @param dependents the dependents to set
     */
    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    /**
     * @return int return the education
     */
    public int getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(int education) {
        this.education = education;
    }

    /**
     * @return int return the selfEmployed
     */
    public int getSelfEmployed() {
        return selfEmployed;
    }

    /**
     * @param selfEmployed the selfEmployed to set
     */
    public void setSelfEmployed(int selfEmployed) {
        this.selfEmployed = selfEmployed;
    }

    /**
     * @return int return the applicantIncome
     */
    public int getApplicantIncome() {
        return applicantIncome;
    }

    /**
     * @param applicantIncome the applicantIncome to set
     */
    public void setApplicantIncome(int applicantIncome) {
        this.applicantIncome = applicantIncome;
    }

    /**
     * @return int return the coapplicantIncome
     */
    public int getCoapplicantIncome() {
        return coapplicantIncome;
    }

    /**
     * @param coapplicantIncome the coapplicantIncome to set
     */
    public void setCoapplicantIncome(int coapplicantIncome) {
        this.coapplicantIncome = coapplicantIncome;
    }

    /**
     * @return int return the loanAmount
     */
    public int getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return int return the loanTerm
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * @param loanTerm the loanTerm to set
     */
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * @return int return the creditHistory
     */
    public int getCreditHistory() {
        return creditHistory;
    }

    /**
     * @param creditHistory the creditHistory to set
     */
    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    /**
     * @return int return the propertyArea
     */
    public int getPropertyArea() {
        return propertyArea;
    }

    /**
     * @param propertyArea the propertyArea to set
     */
    public void setPropertyArea(int propertyArea) {
        this.propertyArea = propertyArea;
    }

    /**
     * @return Boolean return the loanApproved
     */
    public Boolean isLoanApproved() {
        return loanApproved;
    }

    /**
     * @param loanApproved the loanApproved to set
     */
    public void setLoanApproved(Boolean loanApproved) {
        this.loanApproved = loanApproved;
    }

}
