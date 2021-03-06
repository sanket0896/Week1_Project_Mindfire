package com.mindfiresolutions.WorkWithExcel;

/**
 * Contains the details of student as extracted from the rows
 * @author mindfire
 *
 */
public class Student {
	private String name;
	private int roll;
	private int studClass;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getStudClass() {
		return studClass;
	}

	public void setStudClass(int studClass) {
		this.studClass = studClass;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}