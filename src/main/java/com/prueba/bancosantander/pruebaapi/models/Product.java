package com.prueba.bancosantander.pruebaapi.models;
import java.util.concurrent.ThreadLocalRandom;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "product")
public class Product {

    @Id
    private Integer productId;
    @Column (name = "status", nullable = false)
    private Boolean status;
    @Column (name = "name", nullable = false, length = 100)
    private String name;

    @Column (name = "type_id", insertable = false, updatable = false, nullable = false)
    private Integer type_id;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "type_id", nullable = false)
    private ProductType type;

    

    public Product() {
    }


    public Product( Boolean status, String name, ProductType type) {
        this.productId = getRandomId();
        this.status = status;
        this.name = name;
        this.type = type;
    }

    
    /**
     * @return Integer return the productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * @return Boolean return the status
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    private Integer getRandomId() {
        return ThreadLocalRandom.current().nextInt(100000, 999999);
    }

    /**
     * @return Integer return the type_id
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     * @param type_id the type_id to set
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * @return ProductType return the type
     */
    public ProductType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ProductType type) {
        this.type = type;
    }

}
