import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] < b[i]) {
				sum += a[i] + Math.min(a[i + 1], b[i] - a[i]);
				a[i + 1] = Math.max(0, a[i + 1] - (b[i] - a[i]));
			} else {
				sum += b[i];
			}
		}
		System.out.println(sum);
	}
}