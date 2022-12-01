package com.mongo.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.project.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
}
