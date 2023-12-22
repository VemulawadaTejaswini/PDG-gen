import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a - 1) < (n -b)) {
			exe(a, b);
		} else {
			exe(b, a);
		}


	}

	private static void exe(int a, int b) {
		if ((b - a) % 2 != 0) {
			System.out.println(Math.abs(b - a));
			return;
		}
		System.out.println(Math.abs((b - a) / 2));
	}

}
