package com.fullremote.fullremote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FreelanceController {
	@Autowired
	FreelanceRepository  freelanceRepo;
	
	@RequestMapping("/create")
	public Freelancer createFreelance(String pseudo,String mail,String speciality, int credit) {
		Freelancer freelance =new Freelancer(pseudo,mail,speciality,credit);
		return freelanceRepo.save(freelance);
	}
	@RequestMapping("/read")
	public Freelancer getFreelance(Long freelanceId) {
		return freelanceRepo.findById(freelanceId).get();
	}
	
	@RequestMapping("/readall")
	public List<Freelancer> getAllFreelances(){
		return freelanceRepo.findAll();
	}
	
	@RequestMapping("/update")
	public Freelancer updateFreelance(Long id,String pseudo,String mail,String speciality, Integer credit) {
		Freelancer freelance = freelanceRepo.findById(id).get();
		if (pseudo != null) {
			freelance.setPseudo(pseudo);
		}
		if(mail != null) {
			freelance.setMail(mail);
		}
		if(speciality != null) {
			freelance.setSpeciality(speciality);
		}
		if(credit != null) {
			freelance.setCredit(credit);
			
		}
		return freelanceRepo.save(freelance);
		
	}
}