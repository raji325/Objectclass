package com.capgemini.objectclass;

public class TestF {
	public static void main(String[] args) {
		Person p1 = new Person(1, "chitti", 67890.89);
		Person p2 = new Person(2, "pradeep", 97890.89);
		Person p3 = new Person(1, "chitti", 67890.89);
		Person p4 = p1;

		boolean isEquals = p1.equals(p2);
		System.out.println("p1 and p2 is equal=" + isEquals);
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(null));
	}
}
