import java.util.Scanner;


public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = 2;
		int n = sc.nextInt();

		int rezult = 0;

		rezult = lcm(a, n);

		System.out.println(rezult);
	}

	private static int gcd(int a, int n) {
		if(a < n) {
			return gcd(n, a);
		}
		if(n == 0) {
			return a;
		}
		return gcd(n, a % n);
	}

	private static int lcm(int a, int n) {
		return a * n / gcd(a, n);
	}

}
