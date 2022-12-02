package com.mongo.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.mongo.project.entities.Post;

public interface PostRepository  extends MongoRepository<Post,String>{

	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> findByTitle(String text);
	List<Post> findByTitleContainingIgnoreCase(String text);
}
