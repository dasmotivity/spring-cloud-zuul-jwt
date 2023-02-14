package com.javatechie.spring.zulu.api.jwtsecurity;


public class JwtResponse {
	
	private String jwtToken;
	
	  public JwtResponse(String jwtToken) {
			super();
			this.jwtToken = jwtToken;
		}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString() {
		return "JwtResponse [jwtToken=" + jwtToken + "]";
	}
	  
}
