
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exec();
	}

	private static void exec() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			long M = sc.nextLong();

			long l = 1;
			
			for (int i = 0; i < N; i++) {
				long in = sc.nextLong()/2;
				l = lcm(l, in);
			}
			
			if(l>N) {
				System.out.println(0);
				return;
			}
			
			long ans = 0;
			if(M/l %2==0) {
				ans = M/l/2;
			} else {
				ans = M/l/2 + 1;
			}
			
			System.out.println(ans);
		}
	}
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
}