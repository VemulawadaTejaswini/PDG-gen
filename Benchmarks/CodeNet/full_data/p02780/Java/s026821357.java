
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
		double[] a = new double[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (sc.nextInt() - 1) * 0.5 + 1;
		}
		
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			double sum = 0;
			if (i + k > n) {
				break;
			}
			for (int j = i; j < i + k; j++) {
				
				sum += a[j];
			}
			max = Math.max(sum, max);
		}
		
		System.out.println(max);
	}
}


