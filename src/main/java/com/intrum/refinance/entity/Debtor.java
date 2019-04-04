package com.intrum.refinance.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Debtor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "debtor", fetch = FetchType.EAGER)
    private Set<Debt> debts = new HashSet<>();

    private Double averageMonthlyIncomes;
    private Double averageMonthlyExpenses;
    private Double creditBalance;
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

    public Debtor(Double averageMonthlyIncomes, Double averageMonthlyExpenses, Double creditBalance, String dni, String phone, String lastPayment, String validAddress, String comment, String campaignNumber, String productType, String partnerGroup, String kindOfBusiness, Integer age, String city, String validMobile, String ownerCreditor, String sentLastletter, String caseID, String sentLettersNumber, String sentLastSMS, String nationality, String status, String sentSMSNumber, String validEmail, String debtorCase, String lastCall, String portfolio, String paymentNumber) {
        this.averageMonthlyIncomes = averageMonthlyIncomes;
        this.averageMonthlyExpenses = averageMonthlyExpenses;
        this.creditBalance = creditBalance;
        this.dni = dni;
        this.phone = phone;
        this.lastPayment = lastPayment;
        this.validAddress = validAddress;
        this.comment = comment;
        this.campaignNumber = campaignNumber;
        this.productType = productType;
        this.partnerGroup = partnerGroup;
        this.kindOfBusiness = kindOfBusiness;
        this.age = age;
        this.city = city;
        this.validMobile = validMobile;
        this.ownerCreditor = ownerCreditor;
        this.sentLastletter = sentLastletter;
        this.caseID = caseID;
        this.sentLettersNumber = sentLettersNumber;
        this.sentLastSMS = sentLastSMS;
        this.nationality = nationality;
        this.status = status;
        this.sentSMSNumber = sentSMSNumber;
        this.validEmail = validEmail;
        this.debtorCase = debtorCase;
        this.lastCall = lastCall;
        this.portfolio = portfolio;
        this.paymentNumber = paymentNumber;
    }

    public Set<Debt> getDebts() {
        return debts;
    }

    public void addDebt(Debt newDebt){
        this.debts.add(newDebt);
        newDebt.setDebtor(this);
    }

    public Double getAverageMonthlyIncomes() {
        return averageMonthlyIncomes;
    }

    public Double getAverageMonthlyExpenses() {
        return averageMonthlyExpenses;
    }

    public Double getCreditBalance() {
        return creditBalance;
    }

    public String getDni() {
        return dni;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastPayment() {
        return lastPayment;
    }

    public String getValidAddress() {
        return validAddress;
    }

    public String getComment() {
        return comment;
    }

    public String getCampaignNumber() {
        return campaignNumber;
    }

    public String getProductType() {
        return productType;
    }

    public String getPartnerGroup() {
        return partnerGroup;
    }

    public String getKindOfBusiness() {
        return kindOfBusiness;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getValidMobile() {
        return validMobile;
    }

    public String getOwnerCreditor() {
        return ownerCreditor;
    }

    public String getSentLastletter() {
        return sentLastletter;
    }

    public String getCaseID() {
        return caseID;
    }

    public String getSentLettersNumber() {
        return sentLettersNumber;
    }

    public String getSentLastSMS() {
        return sentLastSMS;
    }

    public String getNationality() {
        return nationality;
    }

    public String getStatus() {
        return status;
    }

    public String getSentSMSNumber() {
        return sentSMSNumber;
    }

    public String getValidEmail() {
        return validEmail;
    }

    public String getDebtorCase() {
        return debtorCase;
    }

    public String getLastCall() {
        return lastCall;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getPaymentNumber() {
        return paymentNumber;
    }
}