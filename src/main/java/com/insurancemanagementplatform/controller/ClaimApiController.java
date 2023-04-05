package com.insurancemanagementplatform.controller;

import com.insurancemanagementplatform.entity.Claims;
import com.insurancemanagementplatform.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimApiController {

    @Autowired
    ClaimService claimService;

    @RequestMapping("/")
    public String index(){
        return "Hello String";
    }

    @GetMapping("")
    public List<Claims> getClaims(){
        return claimService.getAllClaims();
    }

    @PostMapping("")
    public Claims adduser(@RequestBody Claims user){
        return claimService.addClaims(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Claims> updateClaims(@PathVariable("id") Long claimId, @RequestBody Claims claims){
        claims.setId(claimId);
        Claims updatedClaims = claimService.updateClaims(claims);

        return new ResponseEntity<>(updatedClaims, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Claims> getClaimById(@PathVariable("id") Long claimId){
        Claims claims = claimService.getClaimById(claimId);
        return new ResponseEntity<>(claims, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClaims(@PathVariable("id") Long claimId){
        claimService.deleteClaimById(claimId);
        return new ResponseEntity<>("Claims Successfully deleted!", HttpStatus.OK);
    }

}
