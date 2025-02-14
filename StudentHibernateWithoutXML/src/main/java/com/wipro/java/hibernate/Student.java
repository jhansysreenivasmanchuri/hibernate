package com.wipro.java.hibernate;

//package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNumber;

	@Column(name = "name")
	private String name;

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
