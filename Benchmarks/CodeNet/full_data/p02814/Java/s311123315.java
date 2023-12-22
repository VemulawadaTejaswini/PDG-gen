import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static final int MAX = 100000;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long m = parseInt(sc.next());
		long[] a = new long[n];
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next())/2;
		}
		sc.close();
		long lcm = a[0]*a[1]/gcm(a[0], a[1]);
		for (i = 0; i < n; i++) {
			lcm = lcm*a[i]/gcm(lcm, a[i]);
		}
		long ans = m / lcm;
		ans = ans - ans / 2;
		out.println(ans);
	}
	public static long gcm(long a, long b) {
		long tmp;
		while((tmp=a%b)!=0) {
			a=b;
			b=tmp;
		}
		return b;
	}
}
