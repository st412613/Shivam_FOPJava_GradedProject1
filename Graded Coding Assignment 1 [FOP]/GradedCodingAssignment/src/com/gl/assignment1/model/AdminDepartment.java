package com.gl.assignment1.model;
//This is AdminDepartment has three method with return type String;
public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
        
		return "Admin Department";
	}

	public String getTodaysWork() {

		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

}
