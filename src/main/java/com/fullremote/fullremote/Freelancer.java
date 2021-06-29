package com.fullremote.fullremote;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 

public class Freelancer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;

	private String pseudo;
	private String mail;
	private String speciality;
	private int credit;
	
	public Freelancer(String pseudo, String mail, String speciality, int credit) {
		this.pseudo = pseudo;
		this.mail = mail;
		this.speciality = speciality;
		this.credit = credit;
		
	}
	
	public Freelancer() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
}
