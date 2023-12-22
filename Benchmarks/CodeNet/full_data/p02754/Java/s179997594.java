import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		long s = a + b;
		long x = n / s;
		System.out.println(a * x + Math.min(a, n % s));
	}
}
