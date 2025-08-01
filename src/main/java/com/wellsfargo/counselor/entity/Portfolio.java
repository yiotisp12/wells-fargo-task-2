package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    private String name;
    private String createdDate;
    private String riskLevel;
    private Double totalValue;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @jakarta.persistence.Id
    private Long id;

    public Portfolio() {}

    public Portfolio(String name, String createdDate, String riskLevel, Double totalValue, Customer customer) {
        this.name = name;
        this.createdDate = createdDate;
        this.riskLevel = riskLevel;
        this.totalValue = totalValue;
        this.customer = customer;
    }

    public Long getPortfolioId() { return portfolioId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public Double getTotalValue() { return totalValue; }
    public void setTotalValue(Double totalValue) { this.totalValue = totalValue; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

