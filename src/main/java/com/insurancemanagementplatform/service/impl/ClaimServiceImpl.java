package com.insurancemanagementplatform.service.impl;

import com.insurancemanagementplatform.entity.Claims;
import com.insurancemanagementplatform.repository.ClaimRepository;
import com.insurancemanagementplatform.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    ClaimRepository claimRepository;

    @Override
    public List<Claims> getAllClaims() {
        return claimRepository.findAll();
    }

    @Override
    public Claims addClaims(Claims claims) {
        Claims newClaims = new Claims();
        newClaims.setClaimNumber(claims.getClaimNumber());
        newClaims.setDescription(claims.getDescription());
        newClaims.setClaimDate(claims.getClaimDate());
        newClaims.setClaimStatus(claims.isClaimStatus());
        newClaims.setPolicyId(claims.getPolicyId());

        claimRepository.save(newClaims);

        return newClaims;
    }

    @Override
    public Claims updateClaims(Claims claims) {
        Claims existingClaims = claimRepository.findById(claims.getId()).get();
        existingClaims.setClaimNumber(claims.getClaimNumber());
        existingClaims.setDescription(claims.getDescription());
        existingClaims.setClaimStatus(claims.isClaimStatus());
        existingClaims.setClaimDate(claims.getClaimDate());
        existingClaims.setPolicyId(claims.getPolicyId());

        claimRepository.save(existingClaims);

        return existingClaims;
    }

    @Override
    public Claims getClaimById(Long claimId) {
        return claimRepository.findById(claimId).get();
    }

    @Override
    public void deleteClaimById(Long claimId) {
        claimRepository.deleteById(claimId);
    }

}
