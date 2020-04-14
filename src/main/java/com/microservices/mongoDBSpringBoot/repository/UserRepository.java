package com.microservices.mongoDBSpringBoot.repository;

import com.microservices.mongoDBSpringBoot.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,Integer> {



}
