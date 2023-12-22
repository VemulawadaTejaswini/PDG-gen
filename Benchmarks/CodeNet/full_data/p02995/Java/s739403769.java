import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();

		long v1 = b/c-(a-1)/c;
		long v2 = b/d-(a-1)/d;
		long cd = lcm(c,d);
		long v3 = b/cd-(a-1)/cd;
		System.out.println(b-(a-1)-(v1+v2-v3));
		sc.close();
	}

	public long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}

	public long lcm(long a, long b) {
		return a*b/gcd(a,b);
	}
}
