package com.example.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ESTUDIO.USERS")
@Access(AccessType.FIELD)
public class User extends ParentEntity{

	private static final long serialVersionUID = 186846492040550174L;
	
	@Column(name = "FIRST_NAME", nullable = false, length = 30)
	private String firstName;
	
	@Column(name = "SECOND_NAME", nullable = true, length = 20)
	private String secondName;
	
	@Column(name = "FIRST_SURNAME", nullable = false, length = 20)
	private String firstSurname;
	
	@Column(name = "SECOND_SURNAME", nullable = true, length = 20)
	private String secondSurname;
	
	@Column(name = "PHONE", nullable = true, length = 15)
	private String phone;
	
	@Column(name = "ADDRESS", nullable = false, length = 350)
	private String address;

}
