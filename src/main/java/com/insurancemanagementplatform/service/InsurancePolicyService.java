package com.insurancemanagementplatform.service;

import com.insurancemanagementplatform.entity.InsurancePolicy;
import com.insurancemanagementplatform.entity.InsurancePolicy;

import java.util.List;

public interface InsurancePolicyService {

    List<InsurancePolicy> getAllPolicies();

    InsurancePolicy addInsurancePolicy(InsurancePolicy insurancePolicy);

    InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy);

    InsurancePolicy getInsurancePolicyById(Long policyId);

    void deleteInsurancePolicy(Long policyId);

//    InsurancePolicy getInsurancePolicyByClientId(Long clientId);
}
