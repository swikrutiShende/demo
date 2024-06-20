package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.nt.CommonInterface.INotification;
@Component
@Qualifier("email")


public class EmailNotification implements INotification{

	@Override
	public void sendNotification(User user, String msg) {
		try 
		{
			System.out.println("Email has been sent to "+user.getName()+" : "+msg);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

}
