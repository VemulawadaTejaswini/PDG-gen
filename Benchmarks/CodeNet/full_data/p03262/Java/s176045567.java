import java.util.*;
import static java.lang.Integer.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int x0 = parseInt(sc.next());
		int[] x = new int[n];
		int[] d = new int[n];
		x[0] = parseInt(sc.next());
		d[0] = abs(x[0]-x0);
		for(i=1;i<n;i++) {
			x[i] = parseInt(sc.next());
			d[i] = abs(x[i]-x[i-1]);
		}
		sc.close();
		int dd = d[0];
		for(i=1;i<n;i++) {
			dd = gcd(dd, d[i]);
			if(dd==1) break;
		}
		out.println(dd);
	}
	public static int gcd(int a, int b) {
		int tmp;
		while(a%b!=0) {
			tmp=b;
			b=a%b;
			a=tmp;
		}
		return b;
	}
}
