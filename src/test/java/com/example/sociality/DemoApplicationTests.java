package com.example.sociality;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.sociality.entity.TopicEntity;
import com.example.sociality.repository.TopicRepository;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes=DemoApplication.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private TopicRepository topicRepository;
	
	@Test
	public void findBySponsor() {
		List<TopicEntity> topics = topicRepository.findBySponsor("allen");
		 Assert.assertNotNull(topics);
		 Assert.assertEquals(2, topics.size());
	}

}
