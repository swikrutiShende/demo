package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.CommonInterface.INotification;

@Service("service")
public class NotificationService {

	@Autowired
	@Qualifier("email")
	private INotification emailNotification;

	@Autowired
	@Qualifier("sms")
	private INotification smsNotification;

	public void sendUserNotification(User user, String message, String type) {
		try {
			if (type.equalsIgnoreCase("sms")) {
				smsNotification.sendNotification(user, message);
			} else if (type.equalsIgnoreCase("email")) {
				emailNotification.sendNotification(user, message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
