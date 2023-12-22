import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		sc.close();
		long cnt = 0;
		boolean f = true;
		if((x+y)%3==0) {
			int tmp = (int)(x+y)/3;
			if(x-tmp>=0 && y-tmp>=0) {
				long[][] c = new long[tmp+1][tmp+1];
				c[0][0] = 1;
				for (i = 1; i <= tmp; i++) {
					for (j = 0; j <= i ; j++) {
						c[i][j] = (j-1>=0?c[i-1][j-1]:0) + (j<i?c[i-1][j]:0);
						if(c[i][j]>=MOD)c[i][j]-=MOD;
					}
				}
				cnt = c[tmp][Math.min(x-tmp, y-tmp)];
			}
		}
		out.println(cnt);
	}
//	public static long comb(long n, long m) {
//		long ans=1;
//		long r=1;
//		for(long i = 0; i < m; i++) {
//			ans*=n;
//			n--;
//			ans/=r;
//			r++;
//		}
//		if(ans>=MOD)ans%=MOD;
//		return ans;
//		
//	}
}
