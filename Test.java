package com.capgemini.objectclass;

public class Test {
public static void main(String[] args) {
	Cow c1=new Cow(1,"ganga",5674.90);
	Cow c2=new Cow(2,"tunga",7686.98);
	Cow c3=new Cow(1,"ganga",5674.90);
	Cow c4=c1;
	boolean isEquals=c1.equals(c2);
	System.out.println("c1 and c2 is equal="+isEquals);
	System.out.println(c1.equals(c3));
	System.out.println(c1.equals(c4));
	System.out.println(c1.equals(null));
	String s="hello";
	System.out.println(c1.equals(s));
}
}
