package com.hdfc.atm.service;

import com.hdfc.atm.iservice.IAuthenticationService;

public class AuthenticationService implements IAuthenticationService {
	private Integer passcode = 2134;
	@Override
	public boolean authenticate(Integer pin) {
		return passcode.equals(pin)?true:false;
	}
	@Override
	public boolean  resetPin(Integer newPin) {
		boolean isChanged=false;
		try {
			this.passcode=newPin;
			isChanged=true;
			
		}catch(Exception ex) {
			System.out.println("Exception raised while changing the PIN: "+ex.getMessage());
		}
		return isChanged;
	}
	


}
