package ru.itpark.businesscards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequestDto {
//  private String name;
  private String username;
  private String password;
  private Person personalInfo;
}
