import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		int n = a * b;
		int m = c * d;

		if (n >= m) {
			System.out.println(n);
		} else if (m >= n) {
			System.out.println(m);
		} else if (n == m) {
			System.out.println(n);

		}
	}
}
