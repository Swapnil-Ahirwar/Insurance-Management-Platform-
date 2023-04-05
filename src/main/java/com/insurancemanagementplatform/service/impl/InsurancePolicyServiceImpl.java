package com.insurancemanagementplatform.service.impl;

import com.insurancemanagementplatform.entity.InsurancePolicy;
import com.insurancemanagementplatform.repository.InsurancePolicyRepository;
import com.insurancemanagementplatform.service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;


    @Override
    public List<InsurancePolicy> getAllPolicies() {
        return insurancePolicyRepository.findAll();
    }

    @Override
    public InsurancePolicy addInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy newInsurancePolicy = new InsurancePolicy();
        newInsurancePolicy.setPolicyNumber(insurancePolicy.getPolicyNumber());
        newInsurancePolicy.setAmount(insurancePolicy.getAmount());
        newInsurancePolicy.setPremium(insurancePolicy.isPremium());
        newInsurancePolicy.setType(insurancePolicy.getType());
        newInsurancePolicy.setStartDate(insurancePolicy.getStartDate());
        newInsurancePolicy.setEndDate(insurancePolicy.getEndDate());
        newInsurancePolicy.setClientId(insurancePolicy.getClientId());

        insurancePolicyRepository.save(newInsurancePolicy);

        return newInsurancePolicy;
    }

    @Override
    public InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicy existingInsurancePolicy = insurancePolicyRepository.findById(insurancePolicy.getId()).get();
        existingInsurancePolicy.setPolicyNumber(insurancePolicy.getPolicyNumber());
        existingInsurancePolicy.setAmount(insurancePolicy.getAmount());
        existingInsurancePolicy.setPremium(insurancePolicy.isPremium());
        existingInsurancePolicy.setType(insurancePolicy.getType());
        existingInsurancePolicy.setStartDate(insurancePolicy.getStartDate());
        existingInsurancePolicy.setEndDate(insurancePolicy.getEndDate());

        insurancePolicyRepository.save(existingInsurancePolicy);

        return existingInsurancePolicy;
    }

    @Override
    public InsurancePolicy getInsurancePolicyById(Long policyId) {
        return insurancePolicyRepository.findById(policyId).get();
    }

    @Override
    public void deleteInsurancePolicy(Long policyId) {
        insurancePolicyRepository.deleteById(policyId);
    }

//    @Override
//    public InsurancePolicy getInsurancePolicyByClientId(Long clientId) {
//        return insurancePolicyRepository.getInsurancePolicyByClientId(clientId);
//    }
}
