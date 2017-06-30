package com.example.sociality.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sociality.entity.TopicEntity;

public interface TopicRepository extends JpaRepository<TopicEntity, Long> {

	List<TopicEntity> findBySponsor(String sponsor);
	
}
