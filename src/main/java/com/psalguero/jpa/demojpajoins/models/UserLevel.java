package com.psalguero.jpa.demojpajoins.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_LEVEL")
public class UserLevel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id_user_level;
	private String code;
	private String description;

	public UserLevel() {

	}

	public UserLevel(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public Long getId_user_level() {
		return id_user_level;
	}

	public void setId_user_level(Long id_user_level) {
		this.id_user_level = id_user_level;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "UserLevel [id_user_level=" + id_user_level + ", code=" + code + ", description=" + description + "]";
	}

	
}
