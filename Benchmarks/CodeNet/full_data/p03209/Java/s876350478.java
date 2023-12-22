import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
	void doIt() {
		solveD();
	}
	long [] h, all;
	long fd(int n, long x) {
		//System.out.println(n + " " + x);
		long ans = 0;
		if(n == 1) ans = 1L;
		else if(x <= 1) ans = 1L;
		else if(x <= 1L + h[n-1]) {
			ans = 1L + fd(n-1, x-1);
		}
		else if(x <= 2L + h[n-1]) {
			ans = 1L + all[n-1];
		}
		else if(x <= 2L + 2L * h[n-1]) {
			ans = 1L + all[n-1] + fd(n-1, x - (2L + h[n-1]));
			
		} else {
			ans = 2L + 2L * all[n-1];
			
		}
		
		return ans;
	}
	void solveD() {
		int N = sc.nextInt();
		long X = sc.nextLong();
		h = new long[N+1];
		all = new long[N+1];
		h[1] = 1; all[1] = 1;
		for(int i = 2; i <= N; i++) {
			h[i] = 2L * h[i-1] + 3L;
			all[i] = 2L * all[i-1] + 1L;
		}
		long ans = fd(N, X);
		System.out.println(ans);
	}
	void solveC() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		long [] h = new long[N];
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);
		long ans = Long.MAX_VALUE;
		for(int i = K-1; i < N; i++) {
			long d = h[i] - h[i-K+1];
			ans = Math.min(ans, d);
		}
		System.out.println(ans);
		
	}
	void solveA() {
		int N = sc.nextInt();
		String ans = "Christmas";
		for(int i = N; i < 25; i++) {
			ans += " Eve";
		}
		System.out.println(ans);
	}
	void solveB() {
		int N = sc.nextInt();
		int [] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		Arrays.sort(p);
		int ans = 0;
		for(int i = 0; i < N-1; i++) {
			ans +=p[i];
		}
		ans += p[N-1]/2;
		System.out.println(ans);
		
	}
}
