package com.izavasconcelos.spring.exemplo1.repository;

import com.izavasconcelos.spring.exemplo1.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {


    User findByName(String name);

    User findByNameIgnoreCase(String name);
}
