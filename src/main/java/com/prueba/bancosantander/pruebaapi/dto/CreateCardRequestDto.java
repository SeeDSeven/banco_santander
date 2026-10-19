package com.prueba.bancosantander.pruebaapi.dto;

public class CreateCardRequestDto {

    private String productId;
    private String holderName;

    public CreateCardRequestDto(String productId, String holderName) {
        this.productId = productId;
        this.holderName = holderName;
    }

    
    /**
     * @return String return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
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

}
