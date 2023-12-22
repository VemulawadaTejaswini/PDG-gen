import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		long answer = 0;
		long xor = a[0];
		long sum = a[0];
		int l = 0, r = 0;
		while (l < n) {
			while (r + 1 < n && (xor ^ a[r + 1]) == sum + a[r + 1]) {
				r++;
				xor ^= a[r];
				sum += a[r];
			}
			answer += r - l + 1;
			xor ^= a[l];
			sum -= a[l];
			l++;
		}

		System.out.println(answer);
	}
}
