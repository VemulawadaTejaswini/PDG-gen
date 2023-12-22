import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] h = new long[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextLong();
		}

		int max = 0;
		int count = 0;
		int i = 0;
		while (i < n - 1) {
			if (h[i] >= h[i + 1]) count++;
			else {
				max = Math.max(max, count);
				count = 0;
			}
			i++;
		}

		max = Math.max(max, count);
		System.out.println(max);
	}
}
