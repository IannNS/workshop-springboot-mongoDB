package com.workshop.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongodb.domain.Post;
import com.workshop.mongodb.repository.PostRepository;
import com.workshop.mongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) { 
		Optional<Post> obj = repo.findById(id); 
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found")); 
	}
	
	public List<Post> findTitleContaining(String text){
		return repo.findByTitleContainingIgnoreCase(text);
	}
}
