import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		long sum = 1;
		int a = 1000000007;
		long[] yaku = new long[n + 1];
		Arrays.fill(yaku, 1);
		int t;
		for (int i = 2; i <= n; i++) {
			t = i;
			int idx = 2;
			while (t >= idx) {
				if (t % idx == 0) {
					yaku[idx]++;
					t = t / idx;
				} else {
					idx++;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			sum =sum * yaku[i] % a;
		}

		System.out.println(sum);
	}
}
