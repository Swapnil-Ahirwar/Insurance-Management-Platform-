package com.insurancemanagementplatform.controller;

import com.insurancemanagementplatform.entity.InsurancePolicy;
import com.insurancemanagementplatform.service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policy")
public class InsurancePolicyApiController {

    @Autowired
    InsurancePolicyService insurancePolicyService;

    @RequestMapping("/")
    public String index(){
        return "Hello String";
    }


    @GetMapping("")
    public List<InsurancePolicy> getInsurancePolicies(){
        return insurancePolicyService.getAllPolicies();
    }

    @PostMapping("")
    public InsurancePolicy addInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
        return insurancePolicyService.addInsurancePolicy(insurancePolicy);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InsurancePolicy> updateInsurancePolicy(@PathVariable("id") Long policyId, @RequestBody InsurancePolicy insurancePolicy){
        insurancePolicy.setId(policyId);
        InsurancePolicy updatedInsurancePolicy = insurancePolicyService.updateInsurancePolicy(insurancePolicy);

        return new ResponseEntity<>(updatedInsurancePolicy, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsurancePolicy> getInsurancePolicyById(@PathVariable("id") Long userId){
        InsurancePolicy user = insurancePolicyService.getInsurancePolicyById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteInsurancePolicy(@PathVariable("id") Long policyId){
        insurancePolicyService.deleteInsurancePolicy(policyId);
        return new ResponseEntity<>("InsurancePolicy Successfully deleted!", HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<InsurancePolicy> getInsurancePolicyById(@PathVariable("id") Long clientId){
//        InsurancePolicy insurancePolicy = insurancePolicyService.getInsurancePolicyById(clientId);
//        return new ResponseEntity<>(insurancePolicy, HttpStatus.OK);
//    }

}
