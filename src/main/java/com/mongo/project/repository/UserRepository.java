package com.mongo.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.project.entities.User;
@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
