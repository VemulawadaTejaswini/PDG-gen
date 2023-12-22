import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int a[] = new int[N+1];
		for (int i=0;i<N;i++) {
			a[i] =sc.nextInt();
		}
		long sum =0;
		long dp0[]= new long[N+1];
		long dp1[]= new long[N+1];
		long dp2[]= new long[N+1];
		dp0[0] = 0;
		dp1[0] = a[0];
		dp0[1] = 0;
		dp1[1] = Math.max(a[0], a[1]);
		dp2[1] = Math.max(a[0], a[1]);
		dp0[2] = 0;
		dp1[2] = Math.max(a[0], Math.max(a[1], a[2]));
		dp2[2] = a[0]+a[2];
		for (int i=3;i<N;i++) {
			if (i%2==0) {
				dp0[i] = Math.max(dp0[i-2]+a[i], dp1[i-2]);
				dp0[i] = Math.max(dp0[i], dp0[i-1]);
				dp1[i] = Math.max(dp1[i-2]+a[i], dp2[i-2]);
				dp1[i] = Math.max(dp1[i], dp1[i-1]);
				dp2[i] = dp2[i-2]+a[i];
			} else {
				dp0[i] = Math.max(dp0[i-2]+a[i],dp1[i-2]);
				dp0[i] = Math.max(dp0[i], dp1[i-1]);
				dp1[i] = Math.max(dp1[i-2]+a[i],dp2[i-1]);
				dp2[i] = dp1[i];
			}
		}
		if (N%2==1) {
			System.out.println(Math.max(dp1[N-1], dp1[N-2]));
		} else {
			System.out.println(Math.max(dp1[N-1], dp2[N-2]));
		}
	}
}