package java_tech_class_day_3;

import java.util.Scanner;

public class day_3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = input.nextInt();

		System.out.println("Enter second number");
		int num2 = input.nextInt();

		int ave = num1 + num2 /2;
		int sum = num1 + num2;

		System.out.println("the sum of two number is =" + sum);
		System.out.println("Average of two number is=" + ave);

	}

}
