package com.psalguero.jpa.demojpajoins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psalguero.jpa.demojpajoins.models.UserLevel;

public interface UserLevelRepository extends JpaRepository<UserLevel, Long >{
	UserLevel findByCode(String code);
}
