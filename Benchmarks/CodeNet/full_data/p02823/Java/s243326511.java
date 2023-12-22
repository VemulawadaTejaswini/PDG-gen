import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong(), a = s.nextLong(), b = s.nextLong();
		long r = n;
		if ((b - a) % 2 == 0) {
			r = (b - a) / 2;
		}
		long r1 = Math.max(a - 1, b - 1);
		long r2 = Math.max(n - a, n - b);
		System.out.println(Math.min(Math.min(r1, r2), r));
	}

}
