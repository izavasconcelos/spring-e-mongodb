package com.izavasconcelos.spring.exemplo1.config;

import com.izavasconcelos.spring.exemplo1.entity.User;
import com.izavasconcelos.spring.exemplo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<User> userList = userRepository.findAll();
        if(userList.isEmpty()) {
            createUser("Izabela", "iza@gmail.com");
            createUser("Joao", "joao@gmail.com");
            createUser("Felipe", "felipe@gmail.com");
        }

        User user = userRepository.findByEmailQualquerCoisa("iza@gmail.com");
        System.out.println(user.getName());
    }

    public void createUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }
}
