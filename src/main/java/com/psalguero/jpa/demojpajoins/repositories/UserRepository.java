package com.psalguero.jpa.demojpajoins.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psalguero.jpa.demojpajoins.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
