
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long l = sc.nextLong();
			long r = sc.nextLong();
			long sub = r - l;

			if (2019 < sub) {
				System.out.println(0);
				return;
			}

			long min = 2020;
			for (long i = l; i <= r; i++) {
				if (i % 2019 < min) {
					min = i % 2019;
				}
			}

			System.out.println(min * (min + 1));
		}
	}
}
