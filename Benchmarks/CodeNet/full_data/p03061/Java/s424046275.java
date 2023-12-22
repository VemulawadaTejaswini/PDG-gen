import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}

		int[] L = new int[N+1];
		int[] R = new int[N+1];
		int[] ans = new int[N];
		
		for (int i=0;i<N;i++) {
			L[i+1]=gcd(L[i],A[i]);
		}
		for (int i=N;i>0;i--) {
			R[i-1]=gcd(R[i],A[i-1]);
		}
		for (int i=0;i<N;i++) {
			ans[i]=gcd(L[i],R[i+1]);
		}
		int max=0;
		for (int i=0;i<N;i++) {
			max=Math.max(max,ans[i]);
		}
		System.out.println(max);
		sc.close();
	}

	static int gcd(int m,int n) {
		if (m<n) {
			return gcd(n,m);
		}
		if (n==0) {
			return m;
		}
		return gcd(n,m%n);
	}
}
