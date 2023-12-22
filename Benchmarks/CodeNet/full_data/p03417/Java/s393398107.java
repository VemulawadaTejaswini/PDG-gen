import java.util.*;
import java.math.BigInteger;
// warm-up
// Avoiding three
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), i=0, j=0;
		BigInteger t = BigInteger.ZERO;
		boolean[][] g = new boolean[N][M];
		int[] row = {-1,1,0,0,-1,-1,1,1};
		int[] col = {0,0,-1,1,-1,1,-1,1};
		for (i=0; i<N; i++) {
			for (j=0; j<M; j++) {
				int k = 0;
				while (k<8) {
					if (i+row[k]>=0 && i+row[k]<N && j+col[k]>=0 && j+col[k]<M) {
						g[i+row[k]][j+col[k]] = !g[i+row[k]][j+col[k]]; 
					}
					k++;
				}
			}
		}
		for (i=0; i<N; i++) for (j=0; j<M; j++) if (!g[i][j]) t = t.add(BigInteger.ONE);
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}