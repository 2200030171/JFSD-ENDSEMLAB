package com.klef.jfsd.exam;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import java.util.Arrays;

	@Configuration
	public class ApplicationConfig {

	    @Bean
	    public Employee employee() {
	        return new Employee(1, "swarna", 40000.0, true, Arrays.asList("Java", "Spring", "RestApi"));
	    }

	    @Bean
	    public Instructor instructor() {
	        return new Instructor(11, "Dr. Ishwarya", "dr.Ishwarya@gmail.com", "1234567890");
	    }

	    @Bean
	    public Course course() {
	        Course course = new Course(1, "Java", 3);
	        course.setInstructor(instructor());
	        return course;
	    }
	}


