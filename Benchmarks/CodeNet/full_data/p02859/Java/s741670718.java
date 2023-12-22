package com.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		Integer num; 
		
		while((num = scan.nextInt())!=null){
			System.out.println(num*num);
		}
		
		
	}
}