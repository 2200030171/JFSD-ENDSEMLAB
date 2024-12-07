package com.klef.jfsd.exam;

public class Course {

	    private Integer cId;
	    private String cName;
	    private Integer credits;
	    private Instructor instructor;

	    public Course(Integer cId, String cName, Integer credits) {
	        this.cId = cId;
	        this.cName = cName;
	        this.credits = credits;
	    }

	    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
	    public Instructor getInstructor() { return instructor; }
	    public Integer getCId() { 
	    	return cId; 
	    	}
	    public String getCName() {
	    	return cName;
	    	}
	    public Integer getCredits() {
	    	return credits; 
	    	}
	}

