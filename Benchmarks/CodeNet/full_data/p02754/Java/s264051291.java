import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long r = n / (a + b);
		long k = 0;
		long ans = 0;
		ans = r * a;
		k = r * (a + b);

		if (k + a < n) {
			ans += a;
		}else {
			ans += n - k;
		}

		System.out.println(ans);
	}

}
