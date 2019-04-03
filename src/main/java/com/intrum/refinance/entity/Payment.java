package com.intrum.refinance.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String transactionNumber;
    private LocalDateTime date;
    private Double amount;
    private String channel;

    private String debt = "";

    public Payment() {
    }

    public Payment(String transactionNumber, LocalDateTime date, Double amount, String channel) {
        this.transactionNumber = transactionNumber;
        this.date = date;
        this.amount = amount;
        this.channel = channel;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public String getChannel() {
        return channel;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getDebt() {
        return debt;
    }
}