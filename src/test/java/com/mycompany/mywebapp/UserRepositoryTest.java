package com.mycompany.mywebapp;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.*;

import com.mycompany.mywebapp.user.User;
import com.mycompany.mywebapp.user.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
  @Autowired
  private UserRepository repo;

  @Test
  public void testAddNew(){
    User user = new User();
    user.setEmail("marien@gmail.com");
    user.setPassword("marien@2013");
    user.setFirstName("Marien");
    user.setLastName("Madango");

    User savedUser= repo.save(user);
    
    Assertions.assertThat(savedUser).isNotNull();
    Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
  }
   
  /* 
  @Test
  public void testListAll(){
    Iterable<User> users=  repo.findAll();
    Assertions.assertThat(users).hasSizeGreaterThan(0);

    for (User user: users){
      System.out.println(user);
    }
  }
  
  
  @Test
  public void testUpdate(){
    Integer userId = 1;
    Optional <User> optionalUser=repo.findById(userId);
    User user=optionalUser.get();
    user.setPassword("Salut_la_Terre");
    repo.save(user);

    User updateUser = repo.findById(userId).get();
    Assertions.assertThat(updateUser.getPassword()).isEqualTo("Salut_la_Terre");
    

  }
  
   @Test
   public void testGet(){
    Integer userId=7;
    Optional <User> optionalUser = repo.findById(userId);
    Assertions.assertThat(optionalUser).isPresent();
    System.out.println(optionalUser.get());
   }

   @Test
   public void testDelete(){
    Integer userId= 7;
    repo.deleteById(userId);

    Optional<User> optionalUser = repo.findById(userId);
    Assertions.assertThat(optionalUser).isNotPresent();

   }
   */
}
