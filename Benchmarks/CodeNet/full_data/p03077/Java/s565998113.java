import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long e = sc.nextLong();

		long min = Math.min(Math.min(a, b), Math.min(c, Math.min(d, e)));

		if (n <= min) {
			System.out.println(5);
		} else {
			System.out.println((long)Math.ceil((double)n / min) + 4);
		}


		sc.close();

	}

}