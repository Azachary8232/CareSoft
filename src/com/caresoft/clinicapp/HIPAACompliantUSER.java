package com.caresoft.clinicapp;

public interface HIPAACompliantUSER {	
	    abstract boolean assignPin(int pin);
	    abstract boolean accessAuthorized(Integer confirmedAuthID);
	

}
