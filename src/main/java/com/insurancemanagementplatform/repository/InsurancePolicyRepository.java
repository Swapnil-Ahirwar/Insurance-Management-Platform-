package com.insurancemanagementplatform.repository;

import com.insurancemanagementplatform.entity.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {

    InsurancePolicy getInsurancePolicyByClientId(Long clientId);
}
