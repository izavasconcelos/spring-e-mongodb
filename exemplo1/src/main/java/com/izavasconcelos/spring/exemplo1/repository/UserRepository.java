package com.izavasconcelos.spring.exemplo1.repository;

import com.izavasconcelos.spring.exemplo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u where u.name like %?1% ")
    User findByName(String name);

    User findByNameIgnoreCase(String name);
}
