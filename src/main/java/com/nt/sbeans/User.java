package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component("user")
@Data
public class User {
	 private int id;
	 private String name;
	 private String email; 
	 private String phoneNumber;
}
