package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    private String transactionType;
    private String transactionDate;
    private Double amount;

    @ManyToOne
    @JoinColumn(name = "investment_id")
    private Investment investment;
    @jakarta.persistence.Id
    private Long id;

    public Transaction() {}

    public Transaction(String transactionType, String transactionDate, Double amount, Investment investment) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.investment = investment;
    }

    public Long getTransactionId() { return transactionId; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public String getTransactionDate() { return transactionDate; }
    public void setTransactionDate(String transactionDate) { this.transactionDate = transactionDate; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public Investment getInvestment() { return investment; }
    public void setInvestment(Investment investment) { this.investment = investment; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
