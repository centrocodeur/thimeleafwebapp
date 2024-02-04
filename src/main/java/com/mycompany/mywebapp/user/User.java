package com.mycompany.mywebapp.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false, unique = true, length = 45)
  private String email;

  @Column(nullable = false,  length = 15)
  private String password;

  @Column(nullable = false,length = 45, name = "fist_name")
  private String firstName;

  @Column(nullable = false,  length = 45, name = "last_name")
  private String lastName;

  private boolean enabled;

  @Override
  public String toString() {
    return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName="
        + lastName + "]";
  }


}
