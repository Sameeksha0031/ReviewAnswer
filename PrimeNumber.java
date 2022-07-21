package com.review.java;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2;i<=num/2;i++) {
			
			if(num%i == 0) {
				flag++;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(num +" is Prime number");
		}else {
			System.out.println(num+" is not a Prime number");
		}
	}

}
