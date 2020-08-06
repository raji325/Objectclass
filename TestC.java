package com.capgemini.objectclass;

public class TestC {
	public static void main(String[] args) {

		Student s1 = new Student(10, "Prathyu", 68.5);
		int id= s1.hashCode();
		System.out.println("s1 id=" +id);
		System.out.println(s1);
		System.out.println("**************************************");
	
		Student s2 = new Student(11, "Solanki", 78.5);
		int sid= s2.hashCode();
		System.out.println("s2 sid=" +sid);
		System.out.println(s2);
		System.out.println("**************************************");
	}

}
