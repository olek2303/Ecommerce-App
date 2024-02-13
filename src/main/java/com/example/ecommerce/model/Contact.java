package com.example.ecommerce.model;

import lombok.Data;


@Data
public class Contact {

    private String name;
    private String mobileNum;
    private String mail;
    private String subject;
    private String message;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", mail='" + mail + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
