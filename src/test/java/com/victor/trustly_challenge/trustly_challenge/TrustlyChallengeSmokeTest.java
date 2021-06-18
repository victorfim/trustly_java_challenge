package com.victor.trustly_challenge.trustly_challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.victor.trustly_challenge.pojo.PersonalData;

@SpringBootTest
public class TrustlyChallengeSmokeTest {
	
	@Autowired
	private PersonalData personalData;
	
	@Test
	public void contextLoadTest() throws Exception {
		assertEquals(personalData.getMyName(), "Victor Zangerolame Fim");
		assertEquals(personalData.getNationality(), "Brazilian");
	}

}
