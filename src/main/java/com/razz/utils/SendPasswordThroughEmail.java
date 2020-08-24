package com.razz.utils;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.razz.model.User;



@Component
public class SendPasswordThroughEmail {

	@Autowired
	JavaMailSender javaMailSender;

	public boolean sendEmail(User user) {

		try {

			MimeMessage mimeMsg = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mimeMsg);

			helper.setTo(user.getUserEmail());
			helper.setSubject("Password");
			helper.setText(user.getUserPazzword(), true);

			javaMailSender.send(mimeMsg);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
