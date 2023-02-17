package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class DetailsFaculty {
	@Id
	private int SubCode;
	private String Facultyname;
	private int Hour;


	public int getsubcode() {
		return SubCode;
	}

	public void setId(int SubCode) {
		this.SubCode = SubCode;
	}

	public String getFacultyname() {
		return Facultyname;
	}

	public void setName(String Facultyname) {
		this.Facultyname = Facultyname;
	}

	public int gethour() {
		return Hour;
	}

	public void sethour(int Hour) {
		this.Hour = Hour;
	}
	public DetailsFaculty(int SubCode,String Facultyname,int Hour)
	{
		super();
		this.SubCode=SubCode;
		this.Facultyname=Facultyname;
		this.Hour=Hour;
	}
	public DetailsFaculty()
	{
		super();
	}
}