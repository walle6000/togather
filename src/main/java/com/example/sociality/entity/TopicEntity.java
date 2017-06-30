package com.example.sociality.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TopicEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String topicTitle;
	private String sponsor;
	private String description;
	private Long totalPassNum;
	private Long timePassNum;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	public String getSponsor() {
		return sponsor;
	}
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getTotalPassNum() {
		return totalPassNum;
	}
	public void setTotalPassNum(Long totalPassNum) {
		this.totalPassNum = totalPassNum;
	}
	public Long getTimePassNum() {
		return timePassNum;
	}
	public void setTimePassNum(Long timePassNum) {
		this.timePassNum = timePassNum;
	}
	
	
}
