import java.util.Scanner;
public class SwitchCase {
	
	   
	
       static void oddeven(int num1) {
    	   if(num1%2==0)
    		   System.out.println("even num");
    	   else
    		   System.out.println("odd num");
       }
       static void posNeg(int num1) {
    	   if(num1 < 0) 
				System.out.println("negative");
			
			else
				System.out.println("positive");
		
       }
       public static void Prime(int num1){  
     	  int i,a=0,val=0;      
     	  a=num1/2;      
     	  if(num1==0||num1==1){  
     	   System.out.println(num1+" is not prime number");      
     	  }else{  
     	   for(i=2;i<=a;i++){      
     	    if(num1%i==0){      
     	     System.out.println(num1+" is not prime number");      
     	     val=1;      
     	     break;      
     	    }      
     	   }      
     	   if(val==0)  { System.out.println(num1+" is prime number"); }  
     	  }
     }
 
	public static void main(String[] args) {
	
		int ans;
		 
		do {
		System.out.println("choose value of n from 1 to 6\n 1:Addition\n 2:Average\n 3:Even or Odd\n 4:Positive or Negative\n 5:Prime or not\n 6:Exit");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		switch(n) {
		case 1:
			Scanner scan =new Scanner(System.in);
			System.out.println("enter the value of num1");
			int num1 = scan.nextInt();
			System.out.println("enter the value of num2");
			int num2 = scan.nextInt();
			System.out.println("Addition:"+" "+(num1+num2));
			break;
		case 2:
			Scanner input =new Scanner(System.in);
			System.out.println("enter the value of num1");
			int no1 = input.nextInt();
			System.out.println("enter the value of num2");
			int no2 = input.nextInt();
			System.out.println("Average:"+" "+(no1+no2)/2);
			break;
		case 3:
			Scanner input1 =new Scanner(System.in);
			System.out.println("enter the value of num1");
			int n1 = sc.nextInt();
			 oddeven(n1);
			 break;
		case 4:
			Scanner input2 =new Scanner(System.in);
			System.out.println("enter the value of num1");
			int numb1 = input2.nextInt();
			posNeg(numb1);
			break;
		case 5:
			Scanner input3 =new Scanner(System.in);
			System.out.println("enter the value of num1");
			int number1 = input3.nextInt();
			Prime(number1);
			break;
		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid choice");
		
		}
		 System.out.println("Will you like to continue 1. yes 2. no");
		    ans = sc.nextInt();
	   }
		while(ans==1);
	}

}
