package com.intrum.refinance;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private String id;

    private Integer initialAmount;
    private Integer currentAmount;
    private Integer interest;

//    @OneToMany(mappedBy="debt", fetch= FetchType.EAGER)
    @ElementCollection
    private Set<String> payments;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "debt_id")
    private Debtor debtor;

    public Debt() {    }

    public Debt(Integer initalAmount, Integer interest) {
        initialAmount = currentAmount =  initalAmount;
        this.interest = interest;
    }

    public Set<String> getPayments() {
        return payments;
    }
}
