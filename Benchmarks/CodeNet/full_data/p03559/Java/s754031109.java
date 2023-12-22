import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] a = new long[n];
		for(i=0;i<n;i++) {
			a[i] = parseLong(sc.next());
		}
		long[] b = new long[n];
		for(i=0;i<n;i++) {
			b[i] = parseLong(sc.next());
		}
		long[] c = new long[n];
		for(i=0;i<n;i++) {
			c[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		Arrays.parallelSort(c);
//		out.println(Arrays.toString(a));
//		out.println(Arrays.toString(b));
//		out.println(Arrays.toString(c));
		long sum=0;
		int js=0;
		int ks=0;
		for(i=0;i<n;i++) {
			while(js<n&&b[js]<=a[i])js++;
			if(js==n)break;
			while(ks<n&&c[ks]<=b[js])ks++;
			k=ks;
			for(j=js;j<n;j++) {
				while(k<n&&c[k]<=b[j])k++;
				if(k==n)break;
//				out.printf("%d,%d,%d%n",  i,j,k);
				sum+=(n-k);
			}
		}
		out.println(sum);
	}
}