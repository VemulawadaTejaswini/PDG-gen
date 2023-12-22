import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int start = a[N - 1];
		if (Math.abs(a[N - 1]) < Math.abs(a[0])) start = a[0];

		int now = 0;
		for (int i = -start; i < start; i++) {
			now = 0;
			for (int j = 0; j < N; j++) {
				now += Math.pow(i - a[j], 2);
			}
			if (now < sum) {
				sum = now;
			}
		}

		for (int i = start; i < -start; i++) {
			now = 0;
			for (int j = 0; j < N; j++) {
				now += Math.pow(i - a[j], 2);
			}
			if (now < sum) {
				sum = now;
			}
		}


		System.out.println(sum);
	}
}
