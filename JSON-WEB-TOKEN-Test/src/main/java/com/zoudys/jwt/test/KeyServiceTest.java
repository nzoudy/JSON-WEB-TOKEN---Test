package com.zoudys.jwt.test;

import static org.junit.Assert.*;
import io.jsonwebtoken.Jwts;

import org.junit.Before;
import org.junit.Test;

import com.zoudys.jwt.service.KeyService;

public class KeyServiceTest {

	KeyService ks;
	
	@Before
	public void setUp() throws Exception {
		ks = new KeyService();
		ks.getKey();
	}

	@Test
	public void test() {
		String str = ks.getCompactJws();
		String result = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJKb2UifQ.yiV1GWDrQyCeoOswYTf_xvlgsnaVVYJM0mU6rkmRBf2T1MBl3Xh2kZii0Q9BdX5-G0j25Qv2WF4lA6jPl5GKuA";
		
		System.out.println("---- "+str);
		
		//assertTrue(result.equals(str));
		assert Jwts.parser().setSigningKey(ks.getKey())
							.parseClaimsJws(ks
							.getCompactJws()).getBody()
							.getSubject().equals("Joe");
		
	}

}
