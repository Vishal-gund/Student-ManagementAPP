package com.practice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

@Entity
@Table
public class Student {
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
		@Column
		@NotBlank(message = "Name cannot be empty")
	    private String name;
		@Email(message = "Enter valid email")
		@Column(unique = true)
		@NotBlank(message = "Email cannot be empty")
	    private String email;
		@Column
	    private String phone;
		@Column
	    private String address;
		@Column
	    private String course;
		@Column
	    private String department;
		@Column
	    private int year;
		@Column
	    private double percentage;
		@Column
	    private String gender;
		@Column
	    private String dateOfBirth;
		@Column
	    private String registrationDate;
		@Column
	    private String status;
	    
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getRegistrationDate() {
			return registrationDate;
		}
		public void setRegistrationDate(String registrationDate) {
			this.registrationDate = registrationDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
}
