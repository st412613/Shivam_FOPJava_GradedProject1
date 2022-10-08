package com.gl.assignment1.model;
//This is HRDepartment has four method with return type String;
public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
