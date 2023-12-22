import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		int x = 0, y = 0, min = 0;

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			y += a[i];
		}
		
		min = y;
		
		for (int i = 0; i < N - 1; i++) {
			x += a[i];
			y -= a[i];
			if (Math.abs(x - y) < min || min == 0) {
				min = Math.abs(x - y);
			} else {
				break;
			}
		}

		System.out.println(min);

		sc.close();
	}
}