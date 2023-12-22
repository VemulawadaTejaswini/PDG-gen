import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long l = Integer.parseInt(sc.next());
		long r = Integer.parseInt(sc.next());

		long min = Integer.MAX_VALUE;

		for (long i = l; i < r; i++) {
			for (long j = i + 1; j <= r; j++) {
				long mod = (i % 2019 * j % 2019) % 2019;
				if (mod == 0) {
					System.out.println(0);
					System.exit(0);
				} else if (mod < min) {
					min = mod;
				}
			}
		}
		System.out.println(min);
	}
}