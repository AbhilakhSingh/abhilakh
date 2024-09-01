package com.apiexamples.payload;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {

    private Long id;

    @Size(min = 2, max = 20, message = "Should be 2 or more characters")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Size(min = 10, max = 10, message = "Should be 10 digits")
    private String mobile;

    private String message;

    private int pageNo;

}