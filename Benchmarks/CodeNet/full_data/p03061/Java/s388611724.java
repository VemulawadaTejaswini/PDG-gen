import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}

		int[] B = new int[N-1];
		int min=1_000_000_005;
		int min_index=0;
		for (int i=0;i<N-1;i++) {
			B[i]=gcd(A[i],A[i]+1);
			if (B[i]<min) {
				min_index=i;
			}
			min=Math.min(min,B[i]);
		}

		int gcd_a=0;
		for (int i=0;i<N;i++) {
			if (i!=min_index-1) {
				gcd_a=gcd(gcd_a,A[i]);
			}
		}
		int gcd_b=0;
		for (int i=0;i<N;i++) {
			if (i!=min_index) {
			gcd_b=gcd(gcd_b,A[i]);
			}
		}
		int gcd_c=0;
		for (int i=0;i<N;i++) {
			if (i!=min_index+1) {
			gcd_c=gcd(gcd_c,A[i]);
			}
		}
		int ans=Math.max(gcd_a,gcd_b);
		ans=Math.max(ans,gcd_c);
		int gcd=0;
		for (int i=0;i<N;i++) {
			gcd=gcd(gcd,A[i]);
		}
		System.out.println(ans);
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