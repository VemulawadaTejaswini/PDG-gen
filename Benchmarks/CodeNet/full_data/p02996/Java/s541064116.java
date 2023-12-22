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
		    long min = 1000000001;
		    int idx = 0;
		    for(int j=i; j<N; j++) {
		        if(min > b[j]) {
		            min = b[j];
		            idx = j;
		        }
		    }
		    long x = a[i];
		    long y = b[i];
		    a[i] = a[idx];
		    b[i] = min;
		    a[idx] = x;
		    b[idx] = y;
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