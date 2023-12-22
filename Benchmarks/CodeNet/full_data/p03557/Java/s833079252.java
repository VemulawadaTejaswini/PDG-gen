import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		Integer[] c = new Integer[n];

		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		for(int i = 0; i < n; i++) {
			c[i] = scanner.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c,Collections.reverseOrder());




		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a_count = 0;
			for(int j = 0; j < n && a[j] < b[i]; j++) {
				a_count++;
			}
			int b_count = 0;
			for(int j = 0; j < n && b[i] < c[j]; j++) {
				b_count++;
				System.out.println("b :" + b[i]);
				System.out.println("c :" + c[j]);
			}
			ans += a_count * b_count;
		}
		System.out.println(ans);
	}
}
