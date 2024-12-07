package com.klef.jfsd.exam;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Employee employee = context.getBean(Employee.class);
        Course course = context.getBean(Course.class);

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getEmployeeId() + ", Name: " + employee.getName() +
                           ", Salary: " + employee.getSalary() + ", Skills: " + employee.getSkills());

        System.out.println("Course Details:");
        System.out.println("ID: " + course.getCId() + ", Name: " + course.getCName() +
                           ", Instructor: " + course.getInstructor().getName());

        context.close();
    }
}
