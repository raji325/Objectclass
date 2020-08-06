package com.capgemini.objectclass;

public class TestB {
public static void main(String[] args) {
	Pen p=new Pen();
	int a=p.hashCode();
	System.out.println("hash code of p="+a);
	System.out.println("***************************************");
	String s=p.toString();
	System.out.println("value of s="+s);
	System.out.println(p);
}
}
