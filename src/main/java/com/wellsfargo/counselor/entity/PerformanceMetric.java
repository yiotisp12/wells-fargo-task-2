package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class PerformanceMetric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long metricId;

    private String date;
    private Double dailyReturn;
    private Double cumulativeReturn;
    private String benchmarkComparison;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
    @jakarta.persistence.Id
    private Long id;

    public PerformanceMetric() {}

    public PerformanceMetric(String date, Double dailyReturn, Double cumulativeReturn, String benchmarkComparison, Portfolio portfolio) {
        this.date = date;
        this.dailyReturn = dailyReturn;
        this.cumulativeReturn = cumulativeReturn;
        this.benchmarkComparison = benchmarkComparison;
        this.portfolio = portfolio;
    }

    public Long getMetricId() { return metricId; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Double getDailyReturn() { return dailyReturn; }
    public void setDailyReturn(Double dailyReturn) { this.dailyReturn = dailyReturn; }

    public Double getCumulativeReturn() { return cumulativeReturn; }
    public void setCumulativeReturn(Double cumulativeReturn) { this.cumulativeReturn = cumulativeReturn; }

    public String getBenchmarkComparison() { return benchmarkComparison; }
    public void setBenchmarkComparison(String benchmarkComparison) { this.benchmarkComparison = benchmarkComparison; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
