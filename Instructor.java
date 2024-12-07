package com.klef.jfsd.exam;

public class Instructor {

	    private Integer instructorId;
	    private String name;
	    private String email;
	    private String phoneNumber;

	    public Instructor(Integer instructorId, String name, String email, String phoneNumber) {
	        this.instructorId = instructorId;
	        this.name = name;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    public Integer getInstructorId() { return instructorId; }
	    public String getName() { return name; }
	    public String getEmail() { return email; }
	    public String getPhoneNumber() { return phoneNumber; }
	}


