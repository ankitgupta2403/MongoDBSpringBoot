package com.microservices.mongoDBSpringBoot.config;

import com.microservices.mongoDBSpringBoot.document.Users;
import com.microservices.mongoDBSpringBoot.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository)
    {
        return args -> {userRepository.save(new Users(1,"Peter","Dev",200L));
            userRepository.save(new Users(2,"Ankit","Dev",300L));
        };
    }


}
