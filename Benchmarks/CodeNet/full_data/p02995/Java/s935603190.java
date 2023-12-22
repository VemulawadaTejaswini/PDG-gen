import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long cd = lcm(c,d);

		// 出力
		System.out.println(b-a+1-
                           ((b/c-(a%c==0?a/c-1:a/c)+
                            (b/d-(a%d==0?a/d-1:a/d)-
                            (b/cd-(a%cd==0?a/cd-1:a/cd))))));
	}

	private static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}

	private static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}