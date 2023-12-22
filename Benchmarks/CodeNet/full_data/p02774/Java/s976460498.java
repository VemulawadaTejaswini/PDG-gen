import java.util.*;
public class Main {

	static int N;
	static long K, INF = 1_000_000_000_000_000_001L;
	static long[] A;
	
	static boolean ok(long X) {
		long c = 0;
		for(int i = 0; i < N; i++) {
			int lb = -1, ub = N, mid;
			while(lb + 1 < ub) {
				mid = (lb + ub) / 2;
				if(A[i] * A[mid] < X) {
					if(A[i] < 0)
						ub = mid;
					else
						lb = mid;
				}
				else {
					if(A[i] < 0)
						lb = mid;
					else
						ub =  mid;
				}
			}
			if(A[i] < 0)
				c += N - ub;
			else
				c += ub;
			if(A[i] * A[i] < X)
				c--;
		}
		return c / 2 < K;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextLong();
		A = new long[N];
		Arrays.setAll(A, i -> sc.nextInt());
		Arrays.sort(A);
		long lb = -INF, ub = INF, mid;
		while(lb + 1 < ub){
			mid = (lb + ub) / 2;
			if(ok(mid))
				lb = mid;
			else
				ub = mid;
		}
		System.out.println(lb);
	}

}