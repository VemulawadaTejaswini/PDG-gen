import java.util.*;

public class Main {

	public static long gcd(long a , long b) {
		if(a > b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		long r = b % a;
		if(r == 0)return a;
		return gcd(a, r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), x = sc.nextLong();
		sc.close();
		long ans = 3 * (n - gcd(n, x));
		System.out.println(ans);
	}

}
