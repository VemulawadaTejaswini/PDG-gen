import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n+2];

		for(int i = 1; i <= n; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		for(int i = 0; i < n+2; i++) {
			int left = L(i, A);
			int right = R(i, A);
			int tmp = gcd(left, right);
			ans = Math.max(ans, tmp);
		}
		
		
		System.out.println(ans);
		sc.close();
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	private static int L(final int i, final int A[]) {
		int m = A[0];
		for(int j = 0; j < i-1; j++) {
			m = gcd(m, A[j]);
		}
		return m;
		
	}
	private static int R(final int i, final int A[]) {
		int m = A[i];
		for(int j = i; j < A.length; j++) {
			m = gcd(m, A[j]);
		}
		return m;
		
	}
}
