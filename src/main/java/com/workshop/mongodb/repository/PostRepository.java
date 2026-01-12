package com.workshop.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.workshop.mongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	// direct search w @Query annotation
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	// Query Method implementation
	List<Post> findByTitleContainingIgnoreCase(String text);
}
