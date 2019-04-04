package com.intrum.refinance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private String id;

    private Double initialAmount;
    private Double currentAmount;
    private Double interest;

    @OneToMany(mappedBy="debt", fetch= FetchType.EAGER)
    private Set<Payment> payments = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "debt_id")
    private Debtor debtor;

    public Debt() {    }

    public Debt(Double initalAmount, Double interest) {
        initialAmount = currentAmount =  initalAmount;
        this.interest = interest;
    }

    public void addPayment(Payment payment){
        this.payments.add(payment);
        payment.setDebt(this);
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public Double getInterest() {
        return interest;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    @JsonIgnore
    public Debtor getDebtor() {
        return debtor;
    }
}
































