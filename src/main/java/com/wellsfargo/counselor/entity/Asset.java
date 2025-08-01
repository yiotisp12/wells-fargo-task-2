package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetId;

    private String tickerSymbol;
    private String assetName;
    private String assetType;
    private Double currentPrice;
    @jakarta.persistence.Id
    private Long id;

    public Asset() {}

    public Asset(String tickerSymbol, String assetName, String assetType, Double currentPrice) {
        this.tickerSymbol = tickerSymbol;
        this.assetName = assetName;
        this.assetType = assetType;
        this.currentPrice = currentPrice;
    }

    public Long getAssetId() { return assetId; }

    public String getTickerSymbol() { return tickerSymbol; }
    public void setTickerSymbol(String tickerSymbol) { this.tickerSymbol = tickerSymbol; }

    public String getAssetName() { return assetName; }
    public void setAssetName(String assetName) { this.assetName = assetName; }

    public String getAssetType() { return assetType; }
    public void setAssetType(String assetType) { this.assetType = assetType; }

    public Double getCurrentPrice() { return currentPrice; }
    public void setCurrentPrice(Double currentPrice) { this.currentPrice = currentPrice; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
