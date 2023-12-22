import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		exec2();
	}

	private static void exec() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			long M = sc.nextLong();

			long l = 1;
			
			for (int i = 0; i < N; i++) {
				long in = (long)sc.nextLong()/2;
				l = lcm(l, in);
			}
			
			if(l>M) {
				System.out.println(0);
				return;
			}
			
			long ans = 0;
			if((M/l)%2==0) {
				ans = M/l/2;
			} else {
				ans = M/l/2 + 1;
			}
			
			System.out.println(ans);
		}
	}
	
	private static void exec2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int[] a = new int[N];
			int[] b = new int[N];
			
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
				
			}
			for (int i = 0; i < N; i++) {
				b[i] = sc.nextInt();
			}
			
			int anum =1;
			for (int i = 0; i < N; i++) {
					for(int j=i+1;j<N;j++) {
						if(a[i] < a[j]) {
							a[j]--;
						}
				}
				anum += p((N-1-i))*(a[i]-1);
			}
			
			int bnum =1;
			for (int i = 0; i < N; i++) {
					for(int j=i+1;j<N;j++) {
						if(b[i] < b[j]) {
							b[j]--;
						}
				}
				bnum += p((N-1-i))*(b[i]-1);
			}
			
			System.out.println(anum);
			System.out.println(bnum);
			System.out.println(Math.abs(anum-bnum));
		}
	}
	
	private static int p(int a) {
		if(a==1) return 1;
		if(a<1) return 0;
		return a*p(a-1);
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