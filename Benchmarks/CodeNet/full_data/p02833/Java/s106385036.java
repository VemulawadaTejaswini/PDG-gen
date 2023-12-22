
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			long N = sc.nextLong();

			if (N % 2 == 1) {
				System.out.println(0);
				return;
			}

			long total = 0;

			for (int m = 1; m <= 18; m++) {
				long div = 1;
				for (int i = 0; i < m; i++) {
					div *= 10;
				}
				total += (N / div);
			}

			System.out.println(total);

		}
	}

}
