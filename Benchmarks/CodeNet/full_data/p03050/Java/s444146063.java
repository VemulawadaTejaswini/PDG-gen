import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = Long.parseLong(sc.next());
		int ans = 0;
		for (long i = 1; i <= n-1; i++) {
			long amari = n % i;
			if (amari != 0) {
			long sho = n / i;
//			System.out.println("i:"+i+" sho:"+sho+" amari:"+amari);
			if (sho == amari)
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
