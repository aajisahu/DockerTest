package com.docker.entity;

import javax.persistence.Column;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
//@Table(name = "dockerUser")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(name ="user_name", unique = true)
	private String username;
	
	@Column(name ="full_name")
	private String fullname;
	
	@Column(name ="email_add")
	private String emailAddress;

}
