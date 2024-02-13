package com.example.ecommerce.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class Contact {

    // not null gdy wartosc nie jest null ale pozwala na null
    // not empty gdy wartosc nie jest null i dlugosc jest wieksza od 0
    // not blank gdy wartosc nie jest null i obiecta dlugosc jest wieksza od 0 

    @NotBlank(message="name must not be blank")
    @Size(min=3, message="name must be at least 3 characters long")
    private String name;

    @NotBlank(message = "Mobile number must not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide a valid email address")
    private String mail;

    @NotBlank(message = "Subject must not be blank")
    @Size(min=5, message = "Subject must be at least 5 characters long")
    private String subject;

    @NotBlank(message = "Message must not be blank")
    @Size(min=10, message = "Message must be at least 10 characters long")
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
