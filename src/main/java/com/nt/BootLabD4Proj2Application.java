package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbeans.NotificationService;
import com.nt.sbeans.User;

@SpringBootApplication
//@ComponentScan(basePackages = "com.nt.sbeans");
//@ComponentScan(basePackages = "com.nt.CommonInterface");
public class BootLabD4Proj2Application {
        @Bean("sc")
		public Scanner getScanner() {
			return new Scanner(System.in);
		}
		public static void main(String[] args) {
	
		ApplicationContext ctx = SpringApplication.run(BootLabD4Proj2Application.class, args);
		
        Scanner sc=ctx.getBean("sc",Scanner.class);
		
		User user1=ctx.getBean("user",User.class);
		
		System.out.println("Enter user id :");
		user1.setId(sc.nextInt());

		System.out.println("Enter user name :");
		sc.nextLine();
		user1.setName(sc.nextLine());

		System.out.println("Enter user mail id :");
		user1.setEmail(sc.next());

		System.out.println("Enter user phone number :");
		user1.setPhoneNumber(sc.next());

		System.out.println("Enter message type :");
		String type = sc.next();

		System.out.println("Enter message :");
		sc.nextLine();
		String message = sc.nextLine();

		NotificationService notify = ctx.getBean("service", NotificationService.class);

		notify.sendUserNotification(user1, message, type);

	}

}
