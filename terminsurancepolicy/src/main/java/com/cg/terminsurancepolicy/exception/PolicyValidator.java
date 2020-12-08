package com.cg.terminsurancepolicy.exception;


import java.util.regex.*;

public class PolicyValidator {
	/*
	  *policyId validation using regular expression
	  */

	
	public boolean validatePolicyId(Integer policyId) throws ResourceNotFoundException {
		String regex="^[0-9]*$";
		Pattern pat=Pattern.compile(regex);
		Matcher m=null;
		try {
		 m =pat.matcher(String.valueOf(policyId));
		}catch(NumberFormatException e) {
			
			}
		return m.matches();
	}
}
