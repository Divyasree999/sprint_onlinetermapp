package com.cg.terminsurancepolicy.service;

import java.util.List;
import com.cg.terminsurancepolicy.entity.Policy;
import com.cg.terminsurancepolicy.exception.ResourceNotFoundException;
/** This class elaborates on service interface
* 
* @author Group-5
* 
*/
public interface PolicyService {
	/**This method is to add policy*/
	
	/**This method is to get all the policies of one particular user */
	
	public List<Policy> getAllPolicies();
	public Policy findPolicyById(Integer policyId) throws ResourceNotFoundException;
	public Policy savePolicy(Policy policy);
	public Policy updatePolicy(Integer policyId, Policy policy) throws ResourceNotFoundException;
	public boolean deletePolicyById(Integer policyId) throws ResourceNotFoundException;

}
