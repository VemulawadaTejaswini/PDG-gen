import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());

		int f = 100;
		for (int i = 1; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				int tmpA = i;
				int fa = 0;
				while (tmpA != 0) {
					tmpA /= 10;
					fa++;
				}
				int tmpB = (int) (n / i);
				int fb = 0;
				while (tmpB != 0) {
					tmpB /= 10;
					fb++;
				}

				f = Math.min(f, Math.max(fa, fb));
			}
		}

		System.out.println(f);
		sc.close();
	}
}