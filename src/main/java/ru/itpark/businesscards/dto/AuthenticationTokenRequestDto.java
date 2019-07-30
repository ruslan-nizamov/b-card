package ru.itpark.businesscards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationTokenRequestDto {
  private String username;
  private String password;
}
