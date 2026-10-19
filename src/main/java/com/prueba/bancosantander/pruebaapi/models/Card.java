package com.prueba.bancosantander.pruebaapi.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "card")
public class Card {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;

    @Column (name = "card_number", nullable = false, length = 16, unique = true)
    private String cardNumber;

    @Column (name = "holder_name", nullable = false, length = 100)
    private String holderName;


    @Column (name = "issue_at", nullable = false)
    private LocalDateTime issueAt;
    @Column (name = "expired_at", nullable = false)
    private LocalDateTime expiredAt;
    @Column (name = "blocked_at")
    private LocalDateTime blockedAt;
    @Column (name = "blocked_reason")
    private String blockedReason;
    @Column (name = "balance", nullable = false)
    private Double balance;
    @Column (name = "currency", nullable = false, length = 3)
    private String currency;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "status_id", nullable = false)
    private Product product;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "card_status_id", nullable = false)
    private CardStatus status;
    


    
    public Card() {
    }



    public Card(String cardNumber, String holderName, LocalDateTime issueAt, LocalDateTime expiredAt,
            LocalDateTime blockedAt, String blockedReason, Double balance, String currency) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.issueAt = issueAt;
        this.expiredAt = expiredAt;
        this.blockedAt = blockedAt;
        this.blockedReason = blockedReason;
        this.balance = balance;
        this.currency = currency;
    }

    

    /**
     * @return Integer return the cardId
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * @param cardId the cardId to set
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * @return String return the cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber the cardNumber to set
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return String return the holderName
     */
    public String getHolderName() {
        return holderName;
    }

    /**
     * @param holderName the holderName to set
     */
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    /**
     * @return LocalDateTime return the issueAt
     */
    public LocalDateTime getIssueAt() {
        return issueAt;
    }

    /**
     * @param issueAt the issueAt to set
     */
    public void setIssueAt(LocalDateTime issueAt) {
        this.issueAt = issueAt;
    }

    /**
     * @return LocalDateTime return the expiredAt
     */
    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    /**
     * @param expiredAt the expiredAt to set
     */
    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * @return LocalDateTime return the blockedAt
     */
    public LocalDateTime getBlockedAt() {
        return blockedAt;
    }

    /**
     * @param blockedAt the blockedAt to set
     */
    public void setBlockedAt(LocalDateTime blockedAt) {
        this.blockedAt = blockedAt;
    }

    /**
     * @return String return the blockedReason
     */
    public String getBlockedReason() {
        return blockedReason;
    }

    /**
     * @param blockedReason the blockedReason to set
     */
    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    /**
     * @return Double return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * @return String return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     * @return Product return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return CardStatus return the status
     */
    public CardStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(CardStatus status) {
        this.status = status;
    }

}
