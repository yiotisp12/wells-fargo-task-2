package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String accountType;
    private Double balance;
    private String institutionName;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @jakarta.persistence.Id
    private Long id;

    public Account() {}

    public Account(String accountType, Double balance, String institutionName, Customer customer) {
        this.accountType = accountType;
        this.balance = balance;
        this.institutionName = institutionName;
        this.customer = customer;
    }

    public Long getAccountId() { return accountId; }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) { this.institutionName = institutionName; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
