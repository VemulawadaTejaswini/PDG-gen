import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		long m = parseLong(sc.next());
		sc.close();
		long g = gcd(n,m);
		long cnt = 1;
		if(g%2L==0) {
			cnt++;
			g /= 2L;
		}
		for (long k = 3L; k <= g; k+=2L) {
			if(g%k==0) {
				cnt++;
				g /= k;
			}
		}
		out.println(cnt);
	}
	public static long gcd(long a, long b) {
		long tmp;
		while((tmp = a%b)!=0) {
			a = b;
			b = tmp;
		}
		return b;
	}

}
