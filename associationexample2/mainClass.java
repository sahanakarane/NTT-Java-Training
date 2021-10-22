package com.associationexample;

public class mainClass {

	public static void main(String[] args) {
		UndergradStudent s1 = new UndergradStudent();
		s1.setName("Sahana");
		System.out.println("name of student:"+""+s1.getName());
		
		s1.setRollno("1DB17CS123");
		System.out.println("roll number"+""+s1.getRollno());
		
		s1.setCity("Bangalore");
		System.out.println("city:"+""+s1.getCity());
		
		s1.setYear(2021);
		System.out.println("year:"+s1.getYear());
		
		s1.hasBranch();
		s1.hasSociety();
		System.out.println("\n********** Student 2*********\n");
		
		UndergradStudent s2 = new UndergradStudent();
		s2.setName("Meghana");
		System.out.println("name of student:"+""+s2.getName());
		
		s2.setRollno("1DB17CS187");
		System.out.println("roll number"+""+s2.getRollno());
		
		s2.setCity("Belgaum");
		System.out.println("city:"+""+s2.getCity());
		
		s2.setYear(2022);
		System.out.println("year:"+s2.getYear());
		
		s2.hasBranch();
		s2.hasSociety();
		
		

	}

}
