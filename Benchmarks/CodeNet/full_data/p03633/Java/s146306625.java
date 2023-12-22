import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long ans = 1;
		for (int i = 0; i < N; i++) {
			long t = sc.nextLong();
			ans = lcm(ans, t);
		}
		
		System.out.println(ans);
	}
	
	//最小公倍数
	public static long lcm(long m, long n) {
		return m / gcd(m, n) * n;
	}
	
	public static long gcd(long m, long n) {
		if (n == 0) return m;
		return gcd(n, m % n);
	}
}