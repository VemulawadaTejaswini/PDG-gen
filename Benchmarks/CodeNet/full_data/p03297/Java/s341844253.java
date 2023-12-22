import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			int t = Integer.parseInt(sc.next());
			long a;
			long b;
			long c;
			long d;
			int counter = 0;
			boolean flag = true;
			int s = 0;

			for (int i = 0; i < t; i++) {

				a = Long.parseLong(sc.next());
				b = Long.parseLong(sc.next());
				c = Long.parseLong(sc.next());
				d = Long.parseLong(sc.next());
				if (a > c + d) {
					s = 1;
				}

				while (flag) {
					a -= b;
					if (a < 0) {
						System.out.println("No");
						flag = false;
					}
					if (a <= c) {
						a += d;
					}

					if (counter > 1000000 && s == 1) {
						System.out.println("No");
						flag = false;
					}
					if (counter > 10000000) {
						System.out.println("Yes");
						flag = false;
					}
					counter++;
				}
				counter = 0;
				s = 0;
				flag = true;
			}

		}

	}
}
