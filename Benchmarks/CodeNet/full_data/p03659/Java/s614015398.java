import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N];
		int x = 0, X = 0, min = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			X += a[i];
		}
		
		x += a[0];
		min = Math.abs(X - (2 * x));
		
		for (int i = 1; i < N - 1; i++) {
			x += a[i];
			if (Math.abs(X - (2 * x)) < min) {
				min = Math.abs(X - (2 * x));
			}
		}

		System.out.println(min);

		sc.close();
	}
}
