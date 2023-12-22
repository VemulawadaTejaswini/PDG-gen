import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long sum = a[0];
		int ans = n;
		int idx = 0;
		for (int i = 1; i < n; i++) {
			if (sum * 2 >= a[i]) {
				sum += a[i];
			} else {
				sum += a[i];
				idx = i;
			}
		}
		System.out.println(ans - idx);
	}
}