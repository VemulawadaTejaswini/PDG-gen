import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);

		int[] dh = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			dh[i] = h[i + 1] - h[i];
		}
		Arrays.sort(dh);

		long sum = 0L;

		for (int i = 0; i < k - 1; i++) {
			sum += (long) dh[i];
		}

		System.out.println(sum);
		sc.close();
	}
}