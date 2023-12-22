import java.util.Scanner;

public class Main {
	final static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] T = new long[N];
		long[] A = new long[N];
		for (int i=0; i<N; i++) T[i] = sc.nextLong();
		for (int i=0; i<N; i++) A[i] = sc.nextLong();
		//
		long[] B = new long[N];
		for (int i=0; i<N; i++) B[i] = min(T[i], A[i]);
		long ans = 0;
		if (max(T)==max(A) && max(T)==max(B)) {
			ans = 1;
			int top = indexOf(B, max(B));
			for (int i=1; i<=top; i++) {
				if (B[i-1]!=B[i]) continue;
				ans *= B[i];
				if (ans>MOD) ans %= MOD;
			}
			for (int i=B.length-2; i>top; i--) {
				if (B[i+1]!=B[i]) continue;
				ans *= B[i];
				if (ans>MOD) ans %= MOD;
			}
		}
		//
		System.out.println(ans);
		sc.close();
	}
	
	static long min(long a, long b) {
		return a<b ? a:b;
	}
	
	static long max(long[] array) {
		long max = Long.MIN_VALUE;
		for (int i=0; i<array.length; i++) {
			if (array[i]>max) max = array[i];
		}
		return max;
	}
	
	static int indexOf(long[] a, long m) {
		for (int i=0; i<a.length; i++) {
			if (a[i]==m) return i;
		}
		return -1;
	}
}
