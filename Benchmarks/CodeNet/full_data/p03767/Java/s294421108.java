import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long[] a = new long[n * 3];
		long sum = 0;
		// 偶数＋偶数＝偶数　奇数＋奇数＝偶数
		int cnt = 1;
		for (int i = 0; i < n * 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		while (cnt != n + 1) {
			sum += a[n * 3 - 2 * cnt];
			cnt++;
		}
		System.out.println(sum);
	}
}
