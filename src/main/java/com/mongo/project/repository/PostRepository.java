package com.mongo.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.project.entities.Post;

public interface PostRepository  extends MongoRepository<Post,String>{

}
