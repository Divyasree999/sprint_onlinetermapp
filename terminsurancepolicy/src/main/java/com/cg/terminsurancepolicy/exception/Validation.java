package com.cg.terminsurancepolicy.exception;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
/** This class is to validate 
 * 
 * @author Chaithanya
 *
 */
public class Validation {
	/** This method is to validate policy id */
	public boolean validatePolicyId(Integer policyId) {
		String regex="^[0-9]";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=null;
		matcher =pattern.matcher(String.valueOf(policyId));
		return matcher.matches();
	}  

}
