package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String financialGoal;
    private String riskTolerance;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;
    @jakarta.persistence.Id
    private Long id;

    public Customer() {}

    public Customer(String firstName, String lastName, String email, String phoneNumber, String dateOfBirth, String financialGoal, String riskTolerance, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.financialGoal = financialGoal;
        this.riskTolerance = riskTolerance;
        this.advisor = advisor;
    }

    public Long getCustomerId() { return customerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getFinancialGoal() { return financialGoal; }
    public void setFinancialGoal(String financialGoal) { this.financialGoal = financialGoal; }

    public String getRiskTolerance() { return riskTolerance; }
    public void setRiskTolerance(String riskTolerance) { this.riskTolerance = riskTolerance; }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
