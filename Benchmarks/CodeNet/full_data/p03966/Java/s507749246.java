import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int t, a;
		long A = 1, B = 1, x, y, z;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			a = sc.nextInt();
			if (A % t != 0) {
				x = A / t + 1;
			} else {
				x = A / t;
			}
			if (B % a != 0) {
				y = B / a + 1;
			} else {
				y = B / a;
			}
			z = Math.max(x, y);
			A = z * t;
			B = z * a;
		}
		System.out.println(A + B);
	}
}