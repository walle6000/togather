package com.example.sociality.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sociality.entity.TopicEntity;
import com.example.sociality.repository.TopicRepository;

@RestController
@RequestMapping("topic/")
public class TopicRestController {

	private TopicRepository topicRepository;

	@Autowired
	public TopicRestController(TopicRepository topicRepository) {
		this.topicRepository = topicRepository;
	}
	
	@RequestMapping(value="/{sponsor}",  
            method=RequestMethod.GET,produces={"application/xml", "application/json"}) 
	@ResponseStatus(HttpStatus.OK)  
	public List<TopicEntity> getTopicsBySponsor(@PathVariable String sponsor){
		List<TopicEntity> topicList = topicRepository.findBySponsor(sponsor);
		return topicList;
	}
	
}
