package com.flowerDemo;

import java.util.Scanner;

public class EnjoyRide {
       public static void ride(int number,int hr,int adults,int child){
    	  
    	   switch(number) {
    	   case 1:
    		   System.out.println("--PRICE DETAILS OF ALIBABA RIDE--");
    		   int adultPrice=50;
        	   int childPrice=40;
        	   
        	   if(hr==1) {
        		   int ad=adults*adultPrice;
        		   int ch=child*childPrice;
        		   System.out.println("Adult Price:"+" "+ad+" "+"Child Price:"+" "+ch);
        		   System.out.println("total price"+" "+ad+ch);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else if(hr > 1) {
        		   int ad2=adults*adultPrice*2;
        		   int cd2=child*childPrice*2;
        		   System.out.println("Total Adult Price:"+" "+ad2);
        		   System.out.println("Total Child Price:"+" "+cd2);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else {
        		   System.out.println("INVALID");
        		   
        	   }
        	   break;
        	   
    	   case 2:
    		   System.out.println("--PRICE DETAILS OF ALPINE RIDE--");
    		   int adultPrice2=60;
        	   int childPrice2=30;
        	   
        	   if(hr==1) {
        		   int ad=adults*adultPrice2;
        		   int ch=child*childPrice2;
        		   System.out.println("Adult Price:"+" "+ad+" "+"Child Price:"+" "+ch);
        		   System.out.println("total price"+" "+ad+ch);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else if(hr > 1) {
        		   int ad2=adults*adultPrice2*2;
        		   int cd2=child*childPrice2*2;
        		   System.out.println("Total Adult Price:"+" "+ad2);
        		   System.out.println("Total Child Price:"+" "+cd2);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else {
        		   System.out.println("INVALID");
        		   
        	   }
        	   break;
        	   
    	   case 3:
    		   System.out.println("--PRICE DETAILS OF BUMPPER CARS RIDE--");
    		   int adultPrice3=45;
        	   int childPrice3=25;
        	   
        	   if(hr==1) {
        		   int ad=adults*adultPrice3;
        		   int ch=child*childPrice3;
        		   System.out.println("Adult Price:"+" "+ad+" "+"Child Price:"+" "+ch);
        		   System.out.println("total price"+" "+ad+ch);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else if(hr > 1) {
        		   int ad2=adults*adultPrice3*2;
        		   int cd2=child*childPrice3*2;
        		   System.out.println("Total Adult Price:"+" "+ad2);
        		   System.out.println("Total Child Price:"+" "+cd2);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else {
        		   System.out.println("INVALID");
        		   
        	   }
        	   break;
        	   
    	   case 4:
    		   System.out.println("--PRICE DETAILS OF BALOON RACE RIDE--");
    		   int adultPrice4=70;
        	   int childPrice4=60;
        	   
        	   if(hr==1) {
        		   int ad=adults*adultPrice4;
        		   int ch=child*childPrice4;
        		   System.out.println("Adult Price:"+" "+ad+" "+"Child Price:"+" "+ch);
        		   System.out.println("total price"+" "+ad+ch);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else if(hr > 1) {
        		   int ad2=adults*adultPrice4*2;
        		   int cd2=child*childPrice4*2;
        		   System.out.println("Total Adult Price:"+" "+ad2);
        		   System.out.println("Total Child Price:"+" "+cd2);
        		   System.out.println("total hr of ride"+" "+hr);
        	   }
        	   else {
        		   System.out.println("INVALID");
        		   
        	   }
        	   break;
        	   
    	   case 5:
    		   System.out.println("Exited");
    		   System.exit(0);
    		   break;
    		   
           default:
        		  System.out.println("Ride name improper");
        	break;
    		   }
       }
	 		 
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many adults:\n");
		int adults=sc.nextInt();
		System.out.println("How many children\n");
		int child=sc.nextInt();
		System.out.println("How many hrs do u want to take ride:\n");
		int hr=sc.nextInt();
		boolean l =true;
		do {
		
		System.out.println("Choose name of ride : \n 1.Alibaba 2. Alpine slide  3. Bumpper Cars  4.Baloon Race 5.Exit\n");
		System.out.println("enter number from 1-5 \n");
	    int number= sc.nextInt();
	    
         ride(number,hr,adults,child);
		} while (l);
		
		
		
		}

}
