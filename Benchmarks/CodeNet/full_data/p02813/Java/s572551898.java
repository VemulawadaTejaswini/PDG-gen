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
		int p = 0;
		int q = 0;
		for(i=0;i<n;i++) {
			p*=10;
			p += parseInt(sc.next());
		}
		for(i=0;i<n;i++) {
			q*=10;
			q += parseInt(sc.next());
		}
		sc.close();
		String s = "12345678".substring(0,n);
		int a=0;
		int b=0;
		factn("", s, n);
		Collections.sort(list);
//		out.println(p);
//		out.println(q);
//		out.println(list.toString());
		for (i = 0; i < list.size(); i++) {
			int r = list.get(i);
			if(p == r) {
				a = i;
			}
			if(q == r) {
				b = i;
			}
		}
//		out.println(a);
//		out.println(b);
		out.println(abs(b-a));
	}
	public static void factn(String s, String t, int n) {
		for (int i = 0; i < n; i++) {
			if(n==1) {
				list.add(parseInt(s + t));
			} else {
				factn(s+t.substring(i,i+1), t.substring(0,i)+(i!=n-1?t.substring(i+1,n):""), n-1);
			}
		}
	}
}
