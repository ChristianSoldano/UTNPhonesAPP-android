package edu.utn.utnphonesapp.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LoginResponseDto {
    private Integer userId;
    private String username;
    private String token;
}
