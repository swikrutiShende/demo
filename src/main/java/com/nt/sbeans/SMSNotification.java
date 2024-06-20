package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.CommonInterface.INotification;
@Component
@Qualifier("sms")
public class SMSNotification implements INotification {
    
	@Override
	public void sendNotification(User user, String msg) {
		
		System.out.println("SMS has been sent to "+user.getName()+ ":"+msg);
	
    }
   
	

}
