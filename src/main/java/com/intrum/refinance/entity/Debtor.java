package com.intrum.refinance.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Debtor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "debtor", fetch = FetchType.EAGER)
    private Set<Debt> debts;

    private Integer averageMonthlyIncomes;
    private Integer averageMonthlyExpenses;
    private Integer creditBalance;
    private String dni;
    private String phone;
    private String lastPayment;
    private String validAddress;
    private String comment;
    private String campaignNumber;
    private String productType;
    private String partnerGroup;
    private String kindOfBusiness;
    private Integer age;
    private String city;
    private String validMobile;
    private String ownerCreditor;
    private String sentLastletter;
    private String caseID;
    private String sentLettersNumber;
    private String sentLastSMS;
    private String nationality;
    private String status;
    private String sentSMSNumber;
    private String validEmail;
    private String debtorCase;
    private String lastCall;
    private String portfolio;
    private String paymentNumber;

    public Debtor() {}

    public Set<Debt> getDebts() {
        return debts;
    }
}




