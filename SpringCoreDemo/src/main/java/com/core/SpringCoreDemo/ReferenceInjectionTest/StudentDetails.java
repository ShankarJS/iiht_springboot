package com.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentDetails {
	private String studentName;
	private int studentClass;
	private int studentAge;
	private String studentCity;
	private StudentSubjects studentSubjects;

	public StudentDetails(String studentName, int studentClass, int studentAge, String studentCity,
			StudentSubjects studentSubjects) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.studentSubjects = studentSubjects;
	}

	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentClass=" + studentClass + ", studentAge="
				+ studentAge + ", studentCity=" + studentCity + ", studentSubjects=" + studentSubjects + "]";
	}

	public StudentDetails() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public StudentSubjects getStudentSubjects() {
		return studentSubjects;
	}

	public void setStudentSubjects(StudentSubjects studentSubjects) {
		this.studentSubjects = studentSubjects;
	}

}
