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
		int[] bpat = new int[n];
		for (i = 0; i < n; i++) {
			bpat[i] |= 1 << i;
			for (j = 0; j < a[i]; j++) {
				bpat[i] |= y[i][j] << (x[i][j]-1);
			}
		}
//		out.println(Arrays.toString(bpat));
		int mx = 0;
		int lm=(int)pow(2,n)-1;
		for (i = 1; i < lm; i++) {
			boolean f = false;
			for (j = 0; j < n; j++) {
				if((i&(1<<j))==0)continue;
				if((i&bpat[j])!=bpat[j]) {
					f = false;
					break;
				}
				f = true;
//				out.printf("%d:%d%n",i,bpat[j]);
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
