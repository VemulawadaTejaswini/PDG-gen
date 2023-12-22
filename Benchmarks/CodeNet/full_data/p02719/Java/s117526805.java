import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();

		long ans = n % k;
		if (ans > n) {
			System.out.println(n);
		} else {
			System.out.println(ans);
		}

		sc.close();
	}

}