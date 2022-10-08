package com.gl.assignment1.model;

/**
 * This is superDeparment has four Method, String return type and all other
 * departments must extend it.
 * 
 * @author Shivam
 *
 */
public class SuperDepartment {
	public String departmentName() {

		return "Super Department";
	}

	public String getTodaysWork() {

		return "No Work as of now";
	}

	public String getWorkDeadline() {

		return " Nil";
	}

	public String isTodayAHoliday() {

		return "Today is not a holiday";
	}

}
