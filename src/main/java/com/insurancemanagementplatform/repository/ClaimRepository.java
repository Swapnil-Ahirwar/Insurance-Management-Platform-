package com.insurancemanagementplatform.repository;


import com.insurancemanagementplatform.entity.Claims;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claims, Long> {
}
