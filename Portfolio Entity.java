package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    private Double portfolioValue;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructors
    public Portfolio() {}

    public Portfolio(Double portfolioValue, Client client) {
        this.portfolioValue = portfolioValue;
        this.client = client;
    }

    // Getters and Setters
    public Long getPortfolioId() {
        return portfolioId;
    }

    public Double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(Double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
