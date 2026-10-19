package com.prueba.bancosantander.pruebaapi.dto;

public class GetCardByIdResponseDto {


    private String cardId;
    private String cardNumber;
    private String holderName;
    private String blockedAt;
    private String blockedReason;
    private Double balance;
    private String expiredAt;
    private String currency;
    private String status;

    public GetCardByIdResponseDto(String cardId, String cardNumber, String holderName, String blockedAt,
            String blockedReason, Double balance, String expiredAt, String currency, String status) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.blockedAt = blockedAt;
        this.blockedReason = blockedReason;
        this.balance = balance;
        this.expiredAt = expiredAt;
        this.currency = currency;
        this.status = status;
    }

    /**
     * @return String return the cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * @param cardId the cardId to set
     */
    public void setCardId(String cardId) {
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
     * @return String return the blockedAt
     */
    public String getBlockedAt() {
        return blockedAt;
    }

    /**
     * @param blockedAt the blockedAt to set
     */
    public void setBlockedAt(String blockedAt) {
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
     * @return String return the expiredAt
     */
    public String getExpiredAt() {
        return expiredAt;
    }

    /**
     * @param expiredAt the expiredAt to set
     */
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
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
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
