import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] A = new long[N];
		long[] F = new long[N];
		long[][] x = new long[N][2];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
			F[i] = sc.nextInt();
		Arrays.sort(A);
		Arrays.sort(F);
		for(int i = 0; i < N; i++) {
			x[i][0] = A[i] * F[N-1-i];
			x[i][1] = i;
		}
		Arrays.sort(x, (a, b) -> (int)a[0]-(int)b[0]);
		int lb = 0, ub = N-1, mid;
		do {
			mid = (ub+lb)/2;
			long KK = K;
			long[] y = new long[N];
			for(int i = 0; i < N; i++)
				y[i] = x[i][0];
			for(int i = N-1; i > mid; i--) {
				long z = (y[i]-y[mid]+F[N-1-(int)x[i][1]]-1)/F[N-1-(int)x[i][1]];
				y[i] -= z*F[N-1-(int)x[i][1]];
				KK -= z;
			}
			if(KK >= 0)
				ub = mid;
			else
				lb = mid + 1;
			if(lb == ub)
				K = KK;
		}while(lb < ub);
		if(ub == 0) {
			long ans = x[0][0];
			for(int i = 0; i < A[0]; i++) {
				x[0][0] -= F[N-1];
				K -= 1;
				for(int j = 1; j < N; j++) {
					long z = (x[i][0]-x[0][0]+F[N-1-(int)x[i][1]]-1)/F[N-1-(int)x[i][1]];
					x[i][0] -= z*F[N-1-(int)x[i][1]];
					K -= z;
				}
				if(K >= 0)
					ans = x[0][0];
				else
					break;
			}
			System.out.println(Math.max(ans,0));
		}
		else
			System.out.println(x[ub][0]);

	}

}