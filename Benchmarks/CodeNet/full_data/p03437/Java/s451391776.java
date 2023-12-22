import java.util.*;

public class Main {
	
	public static long gcd(long a, long b) {
		if(a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		if(b == 1)return b;
		long r = a % b;
		if(r == 0)return b;
		return gcd(b, r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		long ans = -1;
		long gcd = gcd((long)x, (long)y);
		long tmpy = (long)y / gcd;
		long tmpx = (long)x / gcd;
		if(gcd != x) {
			ans = (long)x * (tmpy + 1);
			if(ans > (long)Math.pow(10,  18))ans = -1;
		}
		System.out.println(ans);
	}

}
