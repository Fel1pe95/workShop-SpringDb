package com.mongo.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.project.entities.Post;
import com.mongo.project.repository.PostRepository;
import com.mongo.project.service.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public Post findById(String id) {
		Optional<Post> post = postRepository.findById(id);
		return post.orElseThrow(()-> new ObjectNotFoundException("não encontrado"));
	
	}
	
}
