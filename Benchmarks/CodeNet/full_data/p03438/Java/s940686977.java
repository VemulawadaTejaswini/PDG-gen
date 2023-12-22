import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int a_b = 0;
		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
			a_b += a[i];
		}
		for (int i = 0; i < N; i++) {
			b[i] = scanner.nextInt();
			a_b -= b[i];
		}
		if (-(a_b) % 2 == 1 && a_b < 0) {
			System.out.println("Yes");
		} else if (a_b == 0) {
			for (int i = 0; i < N; i++) {
				if (a[i] != b[i]) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes.");
		} else {
			System.out.println("No");
		}
	}
}
