package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long investmentId;

    private Double quantity;
    private Double purchasePrice;
    private String purchaseDate;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "asset_id")
    private Asset asset;
    @jakarta.persistence.Id
    private Long id;

    public Investment() {}

    public Investment(Double quantity, Double purchasePrice, String purchaseDate, Portfolio portfolio, Asset asset) {
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.portfolio = portfolio;
        this.asset = asset;
    }

    public Long getInvestmentId() { return investmentId; }

    public Double getQuantity() { return quantity; }
    public void setQuantity(Double quantity) { this.quantity = quantity; }

    public Double getPurchasePrice() { return purchasePrice; }
    public void setPurchasePrice(Double purchasePrice) { this.purchasePrice = purchasePrice; }

    public String getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public Asset getAsset() { return asset; }
    public void setAsset(Asset asset) { this.asset = asset; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
