package com.mongo.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.project.entities.Post;

public interface PostRepository  extends MongoRepository<Post,String>{

	List<Post> findByTitleContainingIgnoreCase(String text);
}
