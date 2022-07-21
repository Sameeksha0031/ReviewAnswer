package com.review.java;
import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the series");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int sum;
		System.out.print(a+ ", "+b+", ");
		for(int i=0;i<num;i++) {
			 sum = a+b;
			 a=b;
			 b=sum;
			 System.out.print(sum+", ");
		}

	}

}
