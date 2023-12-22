//package abc157.B;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		
		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
		}
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			for (int j = 0; j < 9; j++) {
				if (a[j] == b) a[j] = -1;
			}
		}
		
		String ans = "No";
		
		if (a[0] + a[1] + a[2] == -3) ans = "Yes";
		if (a[3] + a[4] + a[5] == -3) ans = "Yes";
		if (a[6] + a[7] + a[8] == -3) ans = "Yes";
		if (a[0] + a[3] + a[6] == -3) ans = "Yes";
		if (a[1] + a[4] + a[7] == -3) ans = "Yes";
		if (a[2] + a[5] + a[8] == -3) ans = "Yes";
		if (a[0] + a[4] + a[8] == -3) ans = "Yes";
		if (a[2] + a[4] + a[6] == -3) ans = "Yes";
		
		System.out.println(ans);
	}
	
}