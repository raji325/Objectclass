package com.capgemini.objectclass;

public class FindAnimal {
void showAnimalClass(Animal a) {
	Class c=a.getClass();
	System.out.println(c.getName());
}
}
