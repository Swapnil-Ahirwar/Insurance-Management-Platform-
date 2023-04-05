package com.insurancemanagementplatform.service;



import com.insurancemanagementplatform.entity.Claims;

import java.util.List;

public interface ClaimService {

    List<Claims> getAllClaims();

    Claims addClaims(Claims claims);

    Claims updateClaims(Claims claims);

    Claims getClaimById(Long claimId);

    void deleteClaimById(Long claimId);
}
