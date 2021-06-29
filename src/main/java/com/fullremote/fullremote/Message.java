package com.fullremote.fullremote;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	
	private String description;
	private String langage;
	private Integer freelance_sender_id;
	
 public Message (String description, String langage, Integer freelance_sender_id) {
	 this.description= description;
	 this.langage=langage;
	 this.freelance_sender_id= freelance_sender_id;
	}
	
	public Message () {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	public int getFreelance_sender_id() {
		return freelance_sender_id;
	}
	public void setFreelance_sender_id(int freelance_sender_id) {
		this.freelance_sender_id = freelance_sender_id;
	}
	

}
