package com.capgemini.objectclass;

public class Cow {
	int id;
	String name;
	double price;

	public Cow(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Cow) {
				Cow c = (Cow) obj;
				if (this.id == c.id) {
					if (this.name.contentEquals(c.name)) {
						if (this.price == c.price) {
							return true;
						} else {
							return false;
						}
					} else {
						return false;
					}
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return false;
	}

}

