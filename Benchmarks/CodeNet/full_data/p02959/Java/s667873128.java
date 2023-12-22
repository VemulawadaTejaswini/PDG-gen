import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int[] a = new int[N+1];
		int[] b = new int[N];
		for (int i = 0; i < N+1; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int A = a[i]+a[i+1];
			if (b[i]>=A){
				ans += A;
			} else {
				ans += b[i];
			}
			if (b[i] <= a[i]) {
				a[i] -= b[i];
			} else {
				a[i+1] = a[i+1] - (b[i] - a[i]) >= 0 ? a[i+1] - (b[i] - a[i]) : 0;
				a[i] = 0;
			}
		}
		System.out.println(ans);
	}		
	
	 private static long gcd(long a, long b) {
		    if (b == 0) {
		      return a;
		    }
		    return gcd(b, a%b);
		  }
	 
	 private static long all(long n, long count, int N) {
		    if (count == N) {
			      return count;
			    }
		    return all(1, count, N);
	 }

}