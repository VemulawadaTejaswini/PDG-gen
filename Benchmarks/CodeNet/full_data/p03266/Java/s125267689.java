import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		long ans = 0;
		int p = n / k;
		int q = (n + (k / 2)) / k;

		ans += (long) p * p * p;

		if (k % 2 == 0) {
			ans += (long) q * q * q;
		}
		System.out.println(ans);
		sc.close();
	}
}