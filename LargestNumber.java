package com.review.java;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    System.out.println("Enter the Elements in the array");
    for(int i=0;i<size;i++) {
    	
    	array[i] = sc.nextInt(); 
    }
    int max = 0;
    for(int i=0;i<size;i++) {
    	for(int j=i;j<size;j++)
    	if(array[i] > array[j]) {
    		max = array[j];
    	    array[j] = array[i];
    	    array[i] = max ;
     }
   }
    System.out.println("Largest number in an array is:"+ array[size-1]);
  }
}