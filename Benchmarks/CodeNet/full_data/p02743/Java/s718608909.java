import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();
		long d = c - a - b;
		System.out.println(d > 0 && (4 * a * b) < d * d ? "Yes" : "No");
	}
}
