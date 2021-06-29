package com.fullremote.fullremote;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MessageController {
	@Autowired
	MessageRepository  messageRepo;
	
	@RequestMapping("/sendmessage")
	public Message sendMessage(String description,String langage, Integer freelance_sender_id) {
		 Message message = new Message(description,langage,freelance_sender_id);
		return messageRepo.save(message);
	}
	@RequestMapping("/viewmessage")
	public Message getMessage(Long id) {
		return messageRepo.findById(id).get();
	}
	
}

