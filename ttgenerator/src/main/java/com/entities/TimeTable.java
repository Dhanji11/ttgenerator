package com.entities;

import javax.persistence.*;
@Entity
public class TimeTable {
	@Id
	String Day;
	int lecture1;
	int lecture2;
	int lecture3;
	int lecture4;
	int lecture5;
	int lecture6;
	
	
	
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeTable(String day, int lecture1, int lecture2, int lecture3, int lecture4, int lecture5, int lecture6) {
		super();
		Day = day;
		this.lecture1 = lecture1;
		this.lecture2 = lecture2;
		this.lecture3 = lecture3;
		this.lecture4 = lecture4;
		this.lecture5 = lecture5;
		this.lecture6 = lecture6;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public int getLecture1() {
		return lecture1;
	}
	public void setLecture1(int lecture1) {
		this.lecture1 = lecture1;
	}
	public int getLecture2() {
		return lecture2;
	}
	public void setLecture2(int lecture2) {
		this.lecture2 = lecture2;
	}
	public int getLecture3() {
		return lecture3;
	}
	public void setLecture3(int lecture3) {
		this.lecture3 = lecture3;
	}
	public int getLecture4() {
		return lecture4;
	}
	public void setLecture4(int lecture4) {
		this.lecture4 = lecture4;
	}
	public int getLecture5() {
		return lecture5;
	}
	public void setLecture5(int lecture5) {
		this.lecture5 = lecture5;
	}
	public int getLecture6() {
		return lecture6;
	}
	public void setLecture6(int lecture6) {
		this.lecture6 = lecture6;
	}
	
}