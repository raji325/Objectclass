package com.capgemini.objectclass;

public class TestG {
	public static void main(String[] args) {
		FindAnimal f=new FindAnimal();
		Lion l=new Lion();
		f.showAnimalClass(l);
		Tiger t=new Tiger();
		f.showAnimalClass(t);
		Class c=t.getClass();
		System.out.println(c.getName());
	}
}
