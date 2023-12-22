import java.util.*;
public class Main {

	static long[] a, p;
	
	static long dfs(int N, long X) {
		if(N == 0)
			return X <= 0 ? 0 : 1;
		else if(X <= a[N-1] + 1)
			return dfs(N-1, X-1);
		else
			return p[N-1] + 1 + dfs(N-1, X-a[N-1]-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long X = sc.nextLong();
		a = new long[N];
		p = new long[N];
		a[0] = p[0] = 1;
		for(int i = 1; i < N; i++) {
			a[i] = 2 * a[i-1] + 3;
			p[i] = 2 * p[i-1] + 1;
		}
		System.out.println(dfs(N, X));	
	}

}