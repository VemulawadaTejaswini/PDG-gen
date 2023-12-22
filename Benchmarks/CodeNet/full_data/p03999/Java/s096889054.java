import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		char[] s = sc.next().toCharArray();
		sc.close();
		long[] n = new long[s.length];
		for (i = 0; i < s.length; i++) {
			n[i] = s[i]-'0';
		}
		long sum = ston(n, 0, s.length);
		int mx = (int) pow(2,s.length-1);
		for (i = 1; i < mx; i++) {
			int sp=0;
			int ep=1;
			j=i;
			while(j>0) {
				if((j & 1) == 1) {
					sum += ston(n, sp, ep);
					sp=ep;
				}
				ep++;
				j >>>= 1;
			}
			sum += ston(n, sp, s.length);
		}
		out.println(sum);
	}
	public static long ston(long[] n, int s, int e) {
		long m = 0;
		for (int i = s; i < e; i++) {
			m*=10;
			m+= n[i];
		}
		return m;
	}
}
