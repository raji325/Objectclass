package com.capgemini.objectclass;

public class Student {
int id;
String name;
double percentage;

public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}
public String toString() {
	return "Id=" +id+ " " +"Name=" +name+ "Percentage=" +percentage;
			}

	/*
	 * void printDetails() { System.out.println("StudentDetails");
	 * System.out.println("Id="+id); System.out.println("Name="+name);
	 * System.out.println("Percentage="+percentage); }
	 */
public int hashCode() {
	return id;
}

}
