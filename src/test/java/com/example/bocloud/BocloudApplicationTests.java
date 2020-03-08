package com.example.bocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BocloudApplicationTests {

	@Autowired
    MySvc mySvc;

	@Test
	public void addTest() {
		int res=mySvc.add( 772, 119);
		assert res == 891;
	}

	@Test
	public void addTest2() {
		int res=mySvc.add( 556, 118);
		assert res == 674;
	}


}
