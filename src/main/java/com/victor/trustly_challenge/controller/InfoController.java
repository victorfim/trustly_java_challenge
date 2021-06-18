package com.victor.trustly_challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.trustly_challenge.pojo.PersonalData;

@RestController
public class InfoController {
	
	@Autowired
	private PersonalData personalData;
	
	@RequestMapping("/")
	public ResponseEntity<String> getInfo() {
		try {
			return ResponseEntity.ok().body(personalData.toString());
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("There's something wrong! Please contact the administrator (victor.fim@gmail.com).");
		}
		
	}

}
