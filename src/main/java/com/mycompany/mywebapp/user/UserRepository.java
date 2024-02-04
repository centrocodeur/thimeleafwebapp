package com.mycompany.mywebapp.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

  public Long countById(Integer id);
  
}
