package com.capgemini.objectclass;

public class Marker implements Cloneable {
int cost;
double size;
public Marker(int cost, double size) {
	super();
	this.cost = cost;
	this.size = size;
}
public static void main(String[] args) throws CloneNotSupportedException {
	Marker m=new Marker(35,6.6);
	Marker m1=m;
	m.cost=22;
	System.out.println(m.cost);
	System.out.println(m1.cost);
	Marker m2=new Marker(100,6.6);
	Object o=m2.clone();
	Marker m3=(Marker)o;
	System.out.println("**************************************");
	System.out.println("m2 cost="+m2.cost);
	System.out.println("m2 size="+m2.size);
	System.out.println("m3 cost="+m3.cost);
	System.out.println("m3 size="+m3.size);
	System.out.println("***************************************");
	m3.cost=450;
	m3.size=7.8;
	System.out.println("-------After changes-----------");
	System.out.println("m2 cost="+m2.cost);
	System.out.println("m2 size="+m2.size);
	System.out.println("m3 cost="+m3.cost);
	System.out.println("m3 size="+m3.size);
}
}
