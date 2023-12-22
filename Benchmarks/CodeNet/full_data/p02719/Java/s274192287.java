import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		long ans = n % k;
		if (ans == 0) {
			System.out.println(ans);
		} else {
			long a2 = Math.abs(ans - k);

			if (a2 > n) {
				System.out.println(n);
			} else {
				System.out.println(a2);
			}
		}

		sc.close();
	}

}