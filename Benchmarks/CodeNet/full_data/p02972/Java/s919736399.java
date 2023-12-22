import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		int[] a = new int[n+1];
		for(i=1;i<=n;i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int[] b = new int[n+1];
		for(i=n/2+1;i<=n;i++) {
			b[i] = a[i];
		}
		int sum=0;
		for(i=n/2;i>0;i--) {
			sum = 0;
			for (j = 2*i; j <= n; j++) {
				sum += b[j];
			}
			if((sum & 1) == a[i]) {
				b[i] = 0;
 			} else {
				b[i] = 1;
 			}
		}
		int cnt = 0;
		StringBuilder sb = new StringBuilder();
		for (i = 1; i <= n; i++) {
			if(b[i] == 1) {
				cnt++;
				sb.append(String.valueOf(i));
				sb.append(" ");
			}
		}
		out.println(cnt);
		out.println(sb);
	}
}
