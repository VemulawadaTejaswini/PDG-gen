import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		if (n != x) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			long i = 1;
			while (i <= (2 * n - 1)) {
				System.out.println(i);
				i++;
			}
		}
	}
}