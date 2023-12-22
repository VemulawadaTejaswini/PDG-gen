import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long result = b/x - a/x;

		if ((a == 0) || (a / x == 2)) {
			result++;
		}

		System.out.println(result);

	}
}
