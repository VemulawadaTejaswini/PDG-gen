
import java.util.Scanner;

public class Main {

	public static long gcd(long m, long n) {
		if(n > m) {
			long tmp = m;
			m = n;
			n = tmp;
		}
		if(m % n == 0)
			return n;
		else {
			m = (m % n);
			return gcd(n, m);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long div = gcd(a, b);
		long ans = 1;
		boolean flag = false;
		while(div % 2 == 0) {
			flag = true;
			div /= 2;
		}
		if(flag)
			ans++;
		for(long i = 3; i < div + 1; i += 2) {
			flag = false;
			while(div % i == 0) {
				flag = true;
				div /= i;
			}
			if(flag)
				ans++;
		}
		System.out.println(ans);
	}

}
