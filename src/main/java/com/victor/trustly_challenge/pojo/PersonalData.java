package com.victor.trustly_challenge.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonalData {
	
	@Value("${my_name}")
	private String myName;
	
	@Value("${nationality}")
	private String nationality;
	
	@Value("${biggest_dream}")
	private String biggest_dream;
	
	//GET methods only because we don't need to change the values.
	public String getMyName() {
		return myName;
	}

	public String getNationality() {
		return nationality;
	}

	public String getBiggest_dream() {
		return biggest_dream;
	}
		
	@Override
	public String toString() {
		StringBuilder strb = new StringBuilder();
		strb.append("<b>Name:</b> "+getMyName());
		strb.append("<br/>");
		strb.append("<b>Nationality:</b> "+getNationality());
		strb.append("<br/>");
		strb.append("<b>Biggest dream:</b> "+getBiggest_dream());		
		return strb.toString();
	}
	
}
