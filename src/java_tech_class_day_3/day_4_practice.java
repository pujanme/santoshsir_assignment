package java_tech_class_day_3;

import java.util.Scanner;

public class day_4_practice {

	public static void main(String[] args) {

		//P = Principal(amount)
		//R = Rate(annual interest)
		//T = Time(in years)
		
		//simpleIntererst = P*R*T/100
		
		double Time= 0; 
		double principal=0;
		double Rate=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Principal: ");
		principal = input.nextInt();
		
		System.out.println("Annual Intesrest Rate:");
		Rate=input.nextInt();
		
	    System.out.println("Period (Years):");
		Time=input.nextInt();
	    
		double simpleInterest = (principal*Time*Rate)/100;
		 System.out.println("Simple interest is = " +simpleInterest);
	
	
	
	
	}
	

}
