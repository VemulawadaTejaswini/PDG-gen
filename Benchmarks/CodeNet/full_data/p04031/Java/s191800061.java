import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 101;
		int max = -101;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		int cost = 100000;
		for (int i = min; i <= max; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += Math.pow(i - a[j], 2);
			}
			cost = Math.min(cost, sum);
		}
		System.out.println(cost);
	}
}