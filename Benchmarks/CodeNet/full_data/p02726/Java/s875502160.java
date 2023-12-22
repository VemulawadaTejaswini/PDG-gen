import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static long[] fac;
	public static long[] finv;
	public static long[] inv;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int x = parseInt(sc.next());
		int y = parseInt(sc.next());
		sc.close();
		int[] nd = new int[n+1];
		for (i = 1; i < n; i++) {
			for (j = i+1; j <= n; j++) {
				nd[Math.min(j-i,abs(x-i)+abs(y-j)+1)]++;
			}
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (i = 1; i < n; i++) {
			pw.println(nd[i]);
		}
		pw.flush();
	}
}
