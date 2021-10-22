package com.associationexample;

public class UndergradStudent extends Student {
 private int year;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
public void hasBranch() {
	Branch b = new Branch();
	b.studiesBranch();
}
public void hasSociety() {
	Society s = new Society();
	s.collegeSociety();
}
}
