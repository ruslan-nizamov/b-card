package ru.itpark.businesscards.token;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itpark.businesscards.entity.UserEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TokenEntity {
  @Id
  private String token;
  @ManyToOne(optional = false) // TODO: redis
//  DDL
//  @Column(nullable = false) // TODO: подумать правильно или нет
  private UserEntity user;
}
