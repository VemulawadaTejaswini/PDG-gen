import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		sc.close();
		long ans = n-k+1;
		System.out.println(ans);
		long[][] pas = new long[n+1][n+1];
		pas[0][0] = 1;
		for(i=1;i<=n;i++) {
			pas[i][0] = pas[i-1][0]; 
//			System.out.printf("C(%d,0)=%d%n", i, pas[i][0]);
			for(j=1;j<=i;j++) {
				pas[i][j] = pas[i-1][j-1] + pas[i-1][j]; 
				if(pas[i][j] >= MOD) pas[i][j] %= MOD;
//				System.out.printf("C(%d,%d)=%d%n", i, j, pas[i][j]);
			}
		}
		long ans2 = 0;
		for(i=2;i<=k;i++) {
//			System.out.printf("C(%d,%d)=%d%n", n-k+1, i, pas[n-k+1][i]);
//			System.out.printf("C(%d,%d)=%d%n", k-1, i-1, pas[k-1][i-1]);
			ans2 = pas[n-k+1][i]*pas[k-1][i-1];
//			System.out.println(ans2);
			if(ans2 >= MOD) ans2 %= MOD;
			System.out.println(ans2);
		}
	}
}