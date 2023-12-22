import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		long[] ary = new long[n];
		for (int i = 0; i < n; i++) {
			ary[i] = sc.nextLong();
		}
		long sum = ary[0];
		long total = 0;
		for (int i = 1; i < n; i++) {
			sum = ary[i - 1] + ary[i];
			if (sum > x) {
				long hiku = sum - x;
				total += hiku;
				//right
				if (ary[i] >= hiku) {
					ary[i] -= hiku;
				} else if (ary[i] > 0) {
					ary[i] = 0;
				}
			}
		}
		System.out.println(total);

	}
}