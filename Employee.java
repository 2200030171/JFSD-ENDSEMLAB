package com.klef.jfsd.exam;

import java.util.List;
public class Employee {


	    private Integer empId;
	    private String empname;
	    private Double empsalary;
	    private Boolean isPermanent;
	    private List<String> skills;

	    public Employee(Integer empId, String empname, Double empsalary, Boolean isPermanent, List<String> skills) {
	        this.empId = empId;
	        this.empname = empname;
	        this.empsalary = empsalary;
	        this.isPermanent = isPermanent;
	        this.skills = skills;
	    }

	    public Integer getEmployeeId() { return empId; }
	    public String getName() { return empname; }
	    public Double getSalary() { return empsalary; }
	    public Boolean getIsPermanent() { return isPermanent; }
	    public List<String> getSkills() { return skills; }
	}


