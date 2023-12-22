import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		boolean[] isPrime = new boolean[100005];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i < isPrime.length / 2; i++) {
			if (!isPrime[i]) continue;

			for (int j = 2; i * j < isPrime.length; j++) {
				isPrime[i * j] = false;
			}
		}

		long[] a = new long[100005];
		a[2] = a[1] + (isPrime[1] ? 1 : 0);
		for (int i = 3; i < a.length - 1; i++) {
			if (i % 2 == 0) a[i] = a[i - 1];
			else a[i] = a[i - 1] + ((isPrime[i] && isPrime[(i + 1) / 2]) ? 1 : 0);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < q; i++) {
			sb.append(a[r[i]] - a[l[i] - 1]);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
