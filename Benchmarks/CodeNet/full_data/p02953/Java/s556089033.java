import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = parseInt(sc.next());
		long[] h = new long[n];
		for(i=0;i<n;i++) {
			h[i] = parseLong(sc.next());
		}
		sc.close();
		boolean f = true;
		for(i=1;i<n;i++) {
			if(h[i-1]>=h[i]+2) {
				f=false;
//				out.println(i);
				break;
			} else if(h[i-1]>=h[i]+1) {
				if(i<= n-1 && h[i]>=h[i+1]+1) {
					f=false;
//					out.println(i);
					break;
				}
			}
		}
		String ans = f?"Yes":"No";
		out.println(ans);
	}
}