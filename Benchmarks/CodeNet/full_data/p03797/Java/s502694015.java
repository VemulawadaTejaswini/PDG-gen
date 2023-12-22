import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		if (2 * n >= m) {
			System.out.println(m / 2);
		} else {
			System.out.println(n + (m - 2 * n) / 4);
		}
	}
}
