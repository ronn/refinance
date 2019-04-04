package com.intrum.refinance.entity;

public class Calculation {

    private Double currentDebt;
    private Double averageMonthlyIncome;
    private Double averageMonthlyExpenses;
    private Integer monthlyPaymentsNumber;
    private Double monthlyPaymentsAmount;
    private String email;

    public Calculation() {
    }

    public Calculation(Double currentDebt, Double averageMonthlyIncome, Double averageMonthlyExpenses, Integer monthlyPaymentsNumber, Double monthlyPaymentsAmount, String email) {
        this.currentDebt = currentDebt;
        this.averageMonthlyIncome = averageMonthlyIncome;
        this.averageMonthlyExpenses = averageMonthlyExpenses;
        this.monthlyPaymentsNumber = monthlyPaymentsNumber;
        this.monthlyPaymentsAmount = monthlyPaymentsAmount;
        this.email = email;
    }

    public Double getCurrentDebt() {
        return currentDebt;
    }

    public Double getAverageMonthlyIncome() {
        return averageMonthlyIncome;
    }

    public Double getAverageMonthlyExpenses() {
        return averageMonthlyExpenses;
    }

    public Integer getMonthlyPaymentsNumber() {
        return monthlyPaymentsNumber;
    }

    public Double getMonthlyPaymentsAmount() {
        return monthlyPaymentsAmount;
    }

    public String getEmail() {
        return email;
    }
}