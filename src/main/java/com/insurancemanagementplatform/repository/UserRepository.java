package com.insurancemanagementplatform.repository;

import com.insurancemanagementplatform.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
