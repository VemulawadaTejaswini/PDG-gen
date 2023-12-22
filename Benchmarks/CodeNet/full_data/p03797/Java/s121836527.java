package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanneer = new  Scanner(System.in);
		int N = scanneer.nextInt();
		int M = scanneer.nextInt();
		int t=M-2*N;
		int s=t/4;
		int sum = N+s;
		System.out.println(sum);

	}
}
