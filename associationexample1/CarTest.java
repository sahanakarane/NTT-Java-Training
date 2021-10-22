package com.association;

public class CarTest {

	public static void main(String[] args) {
		Honda hondaAmaze = new Honda();
		hondaAmaze.setColor("White");
		hondaAmaze.setSpeed(160);
		hondaAmaze.carDetails();
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz = new Honda();
		hondaJazz.setColor("Black");
		hondaJazz.setSpeed(150);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();
		
	}

}
