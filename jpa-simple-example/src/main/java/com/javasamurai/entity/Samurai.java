package com.javasamurai.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.javasamurai.enums.Gender;

@Entity
@Table(name="T_SAMURAI")
public class Samurai implements Serializable {
	
	private static final long serialVersionUID = -1044231242717607953L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_samurai")
	private int id;
	
	@Column(name="name", length=255, nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birthday", nullable=true)
	private Calendar birthday;
	
	@Enumerated(EnumType.STRING)
	@Column(name="gender", nullable=true)
	private Gender gender;
	
	public Samurai() {
	}

	public Samurai(String name, GregorianCalendar birthday,
			Gender gender) {
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
