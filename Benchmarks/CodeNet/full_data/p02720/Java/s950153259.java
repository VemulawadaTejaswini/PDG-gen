import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static long[] d = new long[11];
	public static ArrayDeque<Long> que = new ArrayDeque<Long>();
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int k = parseInt(sc.next());
		sc.close();
		long ans = 0;
		if(k<10) {
			ans = k;
		} else {
			int cnt = k-9;
			for (long l = 1;  l < 10; l++) {
				que.add(l);
			}
LABEL:		while(true) {
				long l2 = que.remove();
				long l3 = l2 % 10;
				l2*=10;
				for (long l = Math.max(l3-1, 0); l <= Math.min(l3+1, 9); l++) {
					ans = l2 + l;
//					out.println(ans);
					cnt--;
					if(cnt<=0) break LABEL;
					que.add(ans);
				}
			}
		}
		out.println(ans);
	}
}
