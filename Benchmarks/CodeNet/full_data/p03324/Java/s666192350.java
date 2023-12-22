import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		solve(a, b);

	}

	static void solve(int a, int b) {

		switch (a) {
		case 0:
			if (b == 100) {
				break;
			}
			System.out.println(b);
			break;
		case 1:
			int c = 100 * b;
			if (c == (int) Math.pow(100, 2)) {
				break;
			}
			System.out.println(c);
			break;
		case 2:
			int d = 10000 * b;
			if (d == (int) Math.pow(100, 3)) {
				break;
			}
			System.out.println(d);
			break;
		default:
			break;
		}
	}
}