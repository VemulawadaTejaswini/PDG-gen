import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exec();
	}

	private static void exec() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			long M = sc.nextLong();

			long[] a = new long[N];
			
			
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextLong()/2;
			}
			
			long l = lcm(a[0], a[1]);
			for (int i = 2; i < N; i++) {
				
				l = lcm(l, a[i]);
			}
			
			if(l>N) {
				System.out.println(0);
				return;
			}
			
			System.out.println(M/l/2+1);
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