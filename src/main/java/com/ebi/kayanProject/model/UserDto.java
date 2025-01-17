package com.ebi.kayanProject.model;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String fName;
    private String lName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String jobTitle;
}
