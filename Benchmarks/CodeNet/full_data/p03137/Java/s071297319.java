import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] X = new int[M];

		for(int i=0;i<M;i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		int ret = calc(N-1,1,0,X,M);
		System.out.println(ret);
	}
	// start以降に対し、n斯の駒
	public static int calc(int n, int now, int prev, int[] X, int M) {
		if (now == M) return 0;
		if (n==0) return (X[M-1]-X[prev]);
		int f1 = calc(n-1,now+1,now,X,M);
		int f2 = X[now]-X[prev]+calc(n,now+1,now,X,M);
		int min = Math.min(f1, f2);
		return min;
	}
}
