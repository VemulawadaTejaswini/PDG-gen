import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		long result = 0;
		if ((b - a) % 2 == 0) {
			result = (b - a) / 2;
		}else {
			result = Math.min(b - 1, n - a);
		}

		System.out.println(result);
	}
}
