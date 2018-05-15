package com.source.jaeger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="contacts")
public class Contacts {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idcontact")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="company")
	private String company;
	
	@Column(name="imagepath")
	private String imagePath;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birthdate")
	private String birthDate;
	
	@Column(name="phoneNumber")
	private String phone;
	
	@Column(name="work/personal")
	private String workPersonal;
	
	@Column(name="address")
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWorkPersonal() {
		return workPersonal;
	}
	public void setWorkPersonal(String workPersonal) {
		this.workPersonal = workPersonal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", company=" + company + ", imagePath=" + imagePath + ", email=" + email
				+ ", birthDate=" + birthDate + ", phone=" + phone + ", workPersonal=" + workPersonal + ", address="
				+ address + "]";
	}
	
}
