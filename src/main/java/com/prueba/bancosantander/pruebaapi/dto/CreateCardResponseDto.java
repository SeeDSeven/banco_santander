package com.prueba.bancosantander.pruebaapi.dto;

public class CreateCardResponseDto {

    private String cardId;
    private String cardNumber;
    private String status;
    private String expiredAt;
    private Double balance;
    private String currency;

    public CreateCardResponseDto(String cardId, String cardNumber, String status, String expiredAt, Double balance,
            String currency) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.status = status;
        this.expiredAt = expiredAt;
        this.balance = balance;
        this.currency = currency;
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

}
