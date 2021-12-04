package lecture_1;

import java.util.Scanner;

public class Mobile_recharge {

	public static void main(String[] args) 
	{
       int a,c,d ;
       char name;
    
       
      
       System.out.println("Enter Mob Number");
		Scanner x =new Scanner(System.in);
		a =x.nextInt();
		
		System.out.println("Select Operators");
	name =x.next().charAt(0);
		
		
		System.out.println("Select Plans");
		   c =x.nextInt();
		System.out.println("Enter amount");
		   d =x.nextInt();
		   System.out.println("recharge successful");
		
	}

}
