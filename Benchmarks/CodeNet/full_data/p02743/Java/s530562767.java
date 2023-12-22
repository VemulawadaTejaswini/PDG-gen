import java.util.Scanner;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		long a = (long)scan.nextInt();
		long b = (long)scan.nextInt();
		long c = (long)scan.nextInt();

		long v1 = 4 * a * b;
		long v2 = (c - a - b) * (c - a - b);
		System.out.println(v1 < v2 ? "Yes" : "No");

		scan.close();
	}
}
