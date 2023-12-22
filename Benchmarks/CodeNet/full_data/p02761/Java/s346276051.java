import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int[] s = new int[m];
		int[] c = new int[m];
		for (i = 0; i < m; i++) {
			s[i] = parseInt(sc.next());
			c[i] = parseInt(sc.next());
		}
		sc.close();
		int[] a = new int[n];
		for (i = 0; i < a.length; i++) {
			a[i] = -1;
		}
		boolean f=true;
		for (i = 0; i < m; i++) {
			if(a[s[i]-1] == -1) {
				a[s[i]-1] = c[i];
			} else if(a[s[i]-1] != c[i]) {
				f = false;
				break;
			} 
		}
		if(f) {
			for (i = 0; i < n; i++) {
				if(i < n-1 && a[i]==0) {
					f = false;
					break;
				} 
				if(a[i]==-1) {
					if(i == 0 && n > 1) {
						a[i]=1;
					} else {
						a[i]=0;
					}
				}
			}
		}
		if(f) {
			for (i = 0; i < a.length; i++) {
				out.print(a[i]);
			}
			out.println();
		} else {
			out.println(-1);
		}
	}
}
