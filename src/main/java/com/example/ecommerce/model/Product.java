package com.example.ecommerce.model;

import lombok.Data;

@Data
public class Product {
    private final String name;
    private final String price;
    private final Type type;

    public enum Type {
        HOODIE, TEE
    }
}
