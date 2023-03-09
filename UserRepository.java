package com.Humancloud.HealthCare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Humancloud.HealthCare.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
