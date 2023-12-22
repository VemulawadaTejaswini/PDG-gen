import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		long sum = a + b;

		if (sum % 2 != 0) {
			System.out.println("IMPOSSIBLE");
			return;
		}

		System.out.println(sum / 2);
	}
}