package com.gl.assignment1.driver;

import com.gl.assignment1.model.AdminDepartment;
import com.gl.assignment1.model.HrDepartment;
import com.gl.assignment1.model.TechDepartment;

//This is Driver Class;
public class Main {

	public static void main(String[] args) {
		// create object for all Department
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		// print all functionality of AdminDepartment
		System.out.println(" " + "Welcome to " + admin.departmentName());// single space before Welcome to AdminDepartment;
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());// this function use from super class (SuperDepartment)
		System.out.println();
		// print all functionality of HrDepartment
		System.out.println(" " + "Welcome to " + hr.departmentName());// one space before Welcome to HrDepartment;
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());// this function use from super class (SuperDepartment)
		System.out.println();
		// print all functionality of TechDepartment
		System.out.println(" " + "Welcome to " + tech.departmentName());// one space before Welcome to techDepartment;
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(" " + tech.getTechStackInformation());// one space before Core java;
		System.out.println(tech.isTodayAHoliday());// this function use from super class (SuperDepartment)

	}

}
