import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next()) - i -1;
		}
		sc.close();
		Arrays.sort(a);
		long b0 = 0;
		long b1 = 0;
		if(n%2==1) {
			b0 = a[n/2-1];
			b1 = a[n/2];
		} else {
			b0 = a[n/2];
			b1 = a[n/2];
		}
		long ans0 = 0;
		long ans1 = 0;
		for(i=0;i<n;i++) {
			ans0 += abs(a[i]-b0);
			ans1 += abs(a[i]-b1);
		}
		out.println(ans0<ans1?ans0:ans1);
	}
}
