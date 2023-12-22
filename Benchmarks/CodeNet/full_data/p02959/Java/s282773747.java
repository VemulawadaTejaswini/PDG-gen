import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];

		for (int i = 0; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}

		long sum = 0;

		for (int i = 0; i < n; i++) {
			int tmp = b[i];
			sum += Math.min(a[i], b[i]);
			b[i] = Math.max(b[i] - a[i], 0);
			a[i] = Math.max(a[i] - tmp, 0);

//			System.out.println(i + "->" + i + ", a:" + a[i] + ", b:" + b[i]);

			sum += Math.min(a[i + 1], b[i]);
			a[i + 1] = Math.max(a[i + 1] - b[i], 0);
//			System.out.println(i + "->" + (i + 1) + ", a+1:" + a[i + 1]);
		}
		System.out.println(sum);
		sc.close();
	}
}