import java.util.*;
import java.math.BigInteger;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), A=sc.nextInt(), B=sc.nextInt(), t=n, i=0;
		BigInteger s = BigInteger.ZERO;
		int[] T = new int[n];
		int[] a = new int[n-1];
		int[] b = new int[n-1];
		int[] c = new int[n-1];
		Arrays.fill(a, B);
		while (t-->0) T[i++] = sc.nextInt();
		b[0] = c[0] = (T[1]-T[0])*A;
		for (i=1; i<n-1; i++) {
			b[i] = (T[i+1]-T[i])*A;
			c[i] = b[i]+c[i-1];
		}
		for (i=0; i<n-1; i++) s=s.add(new BigInteger(""+Math.min(Math.min(a[i],b[i]),c[i])));
		System.out.println(s);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}