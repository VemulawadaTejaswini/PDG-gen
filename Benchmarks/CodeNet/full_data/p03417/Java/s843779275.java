import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		if (n == 1 && m == 1) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(m - 2);
		} else if (m == 1) {
			System.out.println(n - 2);
		} else {
			System.out.println((n - 2) * (m - 2));
		}
	}
}
