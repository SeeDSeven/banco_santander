package com.prueba.bancosantander.pruebaapi.dto;

public class BlockCardResponseDto {

    private String cardId;
    private String status;

    public BlockCardResponseDto(String cardId, String status) {
        this.cardId = cardId;
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
