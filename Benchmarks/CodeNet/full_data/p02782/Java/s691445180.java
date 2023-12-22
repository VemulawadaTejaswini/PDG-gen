import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int r1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		int r2 = scanner.nextInt() + 1;
		int c2 = scanner.nextInt() + 1;

		int sum = 0;
		sum += f(r2, c2);
		sum %= 1000000007;
		sum -= f(r1, c2);
		sum %= 1000000007;
		sum -= f(r2, c1);
		sum %= 1000000007;
		sum += f(r1, c1);
		sum %= 1000000007;

		System.out.println(sum);

		scanner.close();
	}

	static int f(int r, int c) {
		if (r == 0 || c == 0)
			return 1;
		return (f(r - 1, c) + f(r, c - 1)) % 1000000007;
	}

}
