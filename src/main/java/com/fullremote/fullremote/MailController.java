package com.fullremote.fullremote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController

public class MailController {

    @Autowired
    private JavaMailSender javaMailSender;

@RequestMapping("/email")
    public String sendEmail(String text, String mail, String sujet) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail);

        msg.setSubject(sujet);
        msg.setText(text);
try {
	javaMailSender.send(msg);
	return "Votre message à été envoyé avec succes";
}
catch(Exception e) {
	return "Votre envoi à echoué";
}
        

    }
}
