import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(); // 縦
		long b = sc.nextInt(); // 横
		long c = 0; // 結果
		long d = 2; // 除算

		if (b % d == 0) {
			long e = b / d;
			c = a * e;
		} else {
			long e = (b / d);
			c = a % d == 0 ? ((a / d) * (e + 1)) + ((a / d) * e) : ((a / d + 1) * (e + 1)) + ((a / d) * e);
		}

		System.out.println(c);

	}
}