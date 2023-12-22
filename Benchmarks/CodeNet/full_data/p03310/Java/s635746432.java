import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N];
		long buf,sum = 0;
		for(int i = 0;i < N;i++) {
			buf = scn.nextLong();
			A[i] = buf;
			sum += buf;
		}
		long P = 0,Q = 0,R = 0,S = 0,ans = 1000000000000l,max,min;
		for(int i = 0;i < N-3;i++) {
			P += A[i];
			for(int j = i + 1;j < N-2;j++) {
				Q += A[j];
				for(int k = j+1;k < N-1;k++) {
					R += A[k];
					S = sum - (P + Q + R);
					max = Math.max(Math.max(P, Q),Math.max(R,S));
					min = Math.min(Math.min(P, Q),Math.min(R,S));
					ans = Math.min(max-min, ans);
					if(R > S)break;
				}
				R = 0;
				if(Q > sum - P - Q)break;
			}
			Q = 0;
			if(P > sum-P)break;
		}
		System.out.println(ans);
		scn.close();
	}
}
