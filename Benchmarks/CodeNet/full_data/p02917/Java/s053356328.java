import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long[] b = new long[n];
		for(i=0;i<n-1;i++) {
			b[i] = parseLong(sc.next());
		}
		sc.close();
		long sum1 = b[n-2];
		long pre = b[n-2];
		for(i=n-3;i>=0;i--) {
			if(b[i] > pre) {
				sum1 += pre;
			} else {
				sum1 += b[i];
				pre = b[i];
			}
		}
		sum1 += pre;
		long sum2 = b[0];
		pre = b[0];
		for(i=1;i<n-1;i++) {
			if(b[i] > pre) {
				sum2 += pre;
			} else {
				sum2 += b[i];
				pre = b[i];
			}
		}
		sum2 += pre;
		out.println(sum1>sum2?sum1:sum2);
	}
}
