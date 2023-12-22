package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        if (x < a) {
        	System.out.println(0);
        	} else if (x >= a){
        	System.out.println(10);
        }
        sc.close();
	}
}