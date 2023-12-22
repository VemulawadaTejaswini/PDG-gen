import java.util.Scanner;

public class Main {

	public static long gcd(long a, long b) {
		long n = a % b;
		if(n == 0) {
			return(b);
		}
		return gcd(b, n);
	}

	public static long lcm(long a, long b) {
		long g = gcd(a, b);
		return(a / g * b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 1;

		for(int i = 0; i < N; i++) {
			long T = sc.nextLong();
			ans = lcm(T, ans);
		}

		System.out.println(ans);
		sc.close();
	}
}
