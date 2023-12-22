import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long ans = 1;
		for(int i=0;i<n;i++){
			long l = scanner.nextLong();
			ans = lcm(ans,l);
		}
		System.out.println(ans);

	}
	private static long gcd(long m, long n) {
		if( n == 0 ){
			return m;
		}
		return gcd(n, m % n);
	}

	private  static long lcm(long m, long n) {
		return m * (n / gcd(m, n));
	}

}
