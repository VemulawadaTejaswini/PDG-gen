import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String[] arr = s.split("");
		int m = a + b;
		int count = 0;
		int countb = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i].equals("a")) {
				count++;
				if (count <= m) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else if (arr[i].equals("b")) {
				count++;
				countb++;
				if (count <= m && countb <= b) {
					System.out.println("Yes");
				} else {
					count--;
					countb--;
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
		
		
	}
}