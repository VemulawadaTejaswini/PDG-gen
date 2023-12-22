import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long Q = sc.nextLong();
		int count = 0;
		final long z = 1000003;
		while (count < Q) {
			long x = sc.nextLong();
			long d = sc.nextLong();
			long n = sc.nextLong();
			long ans = 1;
			long amari = 1;
			long a;

			for (int i = 0; i < n; ++i) {
				a = x + (d * i);
				amari = a % z;
				ans *= amari;
				if (ans >= z) ans %= z;
			}
			System.out.println(ans);
			++count;
		}
	}
}