package com.prueba.bancosantander.pruebaapi.dto;

public class BlockCardRequestDto {

    private String reason;

    public BlockCardRequestDto() {
    }

    public BlockCardRequestDto(String reason) {
        this.reason = reason;
    }

    /**
     * @return String return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

}