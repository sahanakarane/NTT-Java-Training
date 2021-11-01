
import java.util.Scanner;



public class FlowerDemo 
{ 

     public static void displayFlowers(int number) 
     { 
       System.out.println("----Country Names and their flowers----");
     
       
       switch (number) {
       case '1':
       	 System.out.println("Continent Name : ASIA");
       	 
       	 System.out.println("************");
    		 System.out.println("   Country Name  "+ "      National Flower");
    		
    		 System.out.println("INDIA  "+ "               LOTUS");
    		 System.out.println("PAKISTAN.  "+ "           JASMINE");
    		 System.out.println("NEPAL.  "+ "              LALI GURAS");
    		 
           break;

       case '2':
       	System.out.println("Continent Name : EUROPE");
      	 
        System.out.println("************");
   		 System.out.println("   Country Name " + "       National Flower");
   		
   		 System.out.println("GERMANY  "+ "               CORN FLOWER");
   		 System.out.println("FRANCE.  "+ "               LILY");
   		 System.out.println("GREECE.  "+ "              ACANTHUS MOLLIS");
   		
           break;

       case '3':
       	
       	System.out.println("Continent Name : AFRICA");
      	 
       	System.out.println("************");
   		 System.out.println("   Country Name.  "+ "      National Flower");
   		
   		 System.out.println("EGYPT  "+ "               BLUE LOTUS");
   		 System.out.println("NIGERIA.  "+ "           YELLOW TRUMPET");
   		 System.out.println("KENYA.  "+ "              ORCHID");
   		
           break;


       case '4':
           System.out.println("Quit  \n");
           System.exit(0);
           break;

       default:
           System.out.println("Invalid entry");
           break;
   }
   } 
public static void main(String[] args) 
{ 
	char number;
	Scanner sc = new Scanner(System.in);
	 boolean l = true;
	System.out.println("Choose name of the continent : \n 1. ASIA  2. EUROPE  3. AFRICA  4.  or Quit\n");
	do {
    System.out.println("enter number from 1-4 to display values  \n");
    number= sc.next().charAt(0);
	 displayFlowers(number); 
   

	} while (l);
	
	
   } 
 }
