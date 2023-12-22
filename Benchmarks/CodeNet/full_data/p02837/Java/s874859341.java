import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		int[][] x = new int[n][];
		int[][] y = new int[n][];
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
			x[i] = new int[a[i]]; 
			y[i] = new int[a[i]]; 
			for (j = 0; j < a[i]; j++) {
				x[i][j] = parseInt(sc.next());
				y[i][j] = parseInt(sc.next());
			}
		}
		sc.close();
		int[] b1pat = new int[n];
		int[] b0pat = new int[n];
		for (i = 0; i < n; i++) {
			b1pat[i] |= 1 << i;
			for (j = 0; j < a[i]; j++) {
				if(y[i][j]==1) {
					b1pat[i] |= 1 << (x[i][j]-1);
				} else {
					b0pat[i] |= 1 << (x[i][j]-1);
				}
			}
		}
//		out.println(Arrays.toString(b1pat));
//		out.println(Arrays.toString(b0pat));
		int mx = 0;
		int lm=(int)pow(2,n)-1;
		for (i = 1; i < lm; i++) {
			boolean f = false;
			for (j = 0; j < n; j++) {
				if((i&(1<<j))==0)continue;
				if((i&b1pat[j])!=b1pat[j]||((lm-i)&b0pat[j])!=b0pat[j]) {
					f = false;
					break;
				}
				f = true;
//				out.printf("%d:%d,%d%n",i,b1pat[j],b0pat[j]);
			}
			if(f) {
//				out.printf("%d:%n",i);
				int tmp =  Integer.bitCount(i);
				if(mx<tmp) mx = tmp; 
			}
		}
		out.println(mx);
	}
}
