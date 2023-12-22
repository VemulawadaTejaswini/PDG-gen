import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		long r1 = ((a - 1) + (b - 1) + 1) / 2;
		long r2 = ((n - a) + (n - b) + 1) / 2;
		long r3 = (b - a) / 2;

		long result;
		if ((b - a) % 2 == 0) {
			result = Math.min(Math.min(r1, r2), r3);
		}else {
			result = Math.min(r1, r2);
		}

		System.out.println(result);
	}
}
