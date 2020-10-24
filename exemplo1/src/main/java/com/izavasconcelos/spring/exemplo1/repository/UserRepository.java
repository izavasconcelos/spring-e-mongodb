package com.izavasconcelos.spring.exemplo1.repository;

import com.izavasconcelos.spring.exemplo1.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, Long> {

    @Query("{ 'email' : ?0 }")
    User findByEmailQualquerCoisa(String email);

    User findByNameIgnoreCaseLike(String name);
}
