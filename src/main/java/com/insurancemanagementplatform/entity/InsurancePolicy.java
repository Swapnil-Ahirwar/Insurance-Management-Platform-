package com.insurancemanagementplatform.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Table(name = "insurance_policy")
@Entity
@Getter
@Setter
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "type")
    private String type;

    @Column(name = "amount")
    private double amount;

    @Column(name = "premium")
    private boolean premium;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "client_id")
    private Long clientId;

}
