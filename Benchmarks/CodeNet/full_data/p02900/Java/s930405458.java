import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		int ans = 0;

		for (long i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0 && IsPrime(i)) {
				ans++;
				//System.out.println(i);
			}
		}
		System.out.println(ans);

	}

	static boolean IsPrime(long n) {
		if (n < 4)
			return true;
		else if (n % 2 == 0)
			return false;
		double sqrtNum = Math.sqrt(n);
		for (int i = 3; i <= sqrtNum; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
