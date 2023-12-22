import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
			System.out.println(0);
		} else {
			int[] arr = new int[3];
			arr[0] = a;
			arr[1] = b;
			arr[2] = c;
			int max = a;
			int j = 0;
			for (int i = 1; i < 3; i++){
				if (arr[i] > max) {
					max = arr[i];
					j = i;
				}
			}
			arr[j] = 1;
			int ans = 1;
			int i = 0;
			while (i < 3) {
				ans = ans * arr[i];
				i++;
			}
			System.out.println(ans);
		}
		
		
	}
}
