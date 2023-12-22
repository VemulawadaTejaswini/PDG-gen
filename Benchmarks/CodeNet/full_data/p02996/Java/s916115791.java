import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[] a = new long[N];
		long[] b = new long[N];
		
		
		for(int i=0; i<N; i++) {
		    a[i] = Long.parseLong(sc.next());
		    b[i] = Long.parseLong(sc.next());
		}
		for(int i=0; i<N-1; i++) {
		    for(int j=N-1; j>i; j--) {
		        if(b[j-1] > b[j]) {
		            long x = a[j];
		            long y = b[j];
		            a[j] = a[j-1];
		            b[j] = b[j-1];
		            a[j-1] = x;
		            b[j-1] = y;
		        }
		    }
		}
		
		String ans = "Yes";
		long sum = 0;
		for(int i=0; i<N; i++) {
		    sum += a[i];
		    if(sum > b[i]) {
		        ans = "No";
		        break;
		    }
		}
        System.out.println(ans);
	}
} 