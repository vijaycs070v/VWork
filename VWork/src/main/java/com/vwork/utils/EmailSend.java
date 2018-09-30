package com.vwork.utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.testng.annotations.Test;

public class EmailSend {

	@Test
	public  void maintest() throws EmailException {
	
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("vijaykumar.ab10@gmail.com", "51265126"));
		email.setSSLOnConnect(true);
		email.setFrom("vijaykumar.ab10@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("initg.vk@gmail.com");
		email.send();

		System.out.println("email sent");
	}

}
