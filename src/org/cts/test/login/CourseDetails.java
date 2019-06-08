package org.cts.test.login;

public class CourseDetails {

	public void javaCourse() {
		// this is my method
		System.out.println("java course started");
	}

	public void oracleCourse() {
		System.out.println("oracle course started");
	}
	
	public static void main(String[] args) {
		//classname objectname=new Classname();
		CourseDetails   d=new CourseDetails();
		d.oracleCourse();  
		d.javaCourse();
	}
}
