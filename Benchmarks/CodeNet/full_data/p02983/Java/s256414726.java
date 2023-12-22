import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		long a,b;

		Scanner sc = new Scanner(System.in);

		a = sc.nextLong();
		b = sc.nextLong();

		long ans = 0;


		if (b - a >= 2019) {
			System.out.println(ans);
		} else {

			long ba = b - a;
			long tmp = 0;

			for (long i = 1; i <= ba; ++i) {
				for (long j = 1; j <= ba; ++j) {

					if (j == 1 && i ==1) {
						ans = (a * i) * (a + j) % 2019;
					}

					tmp = (a * i) * (a + j) % 2019;

					if (ans > tmp) {
						ans = tmp;
					}

				}

			}

			System.out.println(ans);

		}

	}
}
