package com.zoudys.jwt.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

import java.security.Key;


public class KeyService {
	// We need a signing key, so we'll create one just for this example. Usually
	// the key would be read from your application configuration instead
	
	private Key key; // = MacProvider.generateKey();
	private String compactJws;
	
	public KeyService() {
	}

	public Key getKey() {
		key = MacProvider.generateKey();
		return key;
	}

	public String getCompactJws(){
		compactJws = Jwts.builder().setSubject("Joe")
				.signWith(SignatureAlgorithm.HS512, key).compact();
		return compactJws;
	}
}
