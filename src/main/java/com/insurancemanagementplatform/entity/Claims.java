package com.insurancemanagementplatform.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "claims")
@Entity
@Getter
@Setter
public class Claims {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "claim_number")
    private String claimNumber;

    @Column(name = "description")
    private String description;

    @Column(name = "claim_date")
    private Date claimDate;

    @Column(name = "claim_status")
    private boolean claimStatus;

    @Column(name = "policy_id")
    private Long policyId;

}
