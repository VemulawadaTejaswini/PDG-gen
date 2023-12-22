
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int max = 0;
		outside: for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				if (i + k > n) {
					break outside;
				}
				sum += a[j];
			}
			if (sum > max) {
				max = sum;
			}
		}
		
		System.out.println((max - k) * 0.5 + k);
		
	}
}


