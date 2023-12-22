import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
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
		boolean f=true;
		long lcm = 0;
		if(n==1) {
			lcm = a[0];
		} else {
			lcm = a[0]*a[1]/gcm(a[0], a[1]);
			for (i = 2; i < n; i++) {
				lcm = lcm*a[i]/gcm(lcm, a[i]);
				if(lcm>m) {
					f=true;
					break;
				}
			}
		}
//		out.println(lcm);
		long ans = 0;
		if(f) {
			ans = m / lcm;
			ans = ans - ans / 2;
		}
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
