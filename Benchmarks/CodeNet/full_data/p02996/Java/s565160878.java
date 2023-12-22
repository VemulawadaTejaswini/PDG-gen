import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long[][] ab = new long[N][2];
		for(int i=0; i<N; i++) {
		    ab[i][0] = Long.parseLong(sc.next());
		    ab[i][1] = Long.parseLong(sc.next());
		}
		for(int i=0; i<N-1; i++) {
		    long min = ab[i][1];
	        int idx = i;
		    for(int j=i+1; j<N; j++) {
	            if(min > ab[j][1]) {
	                min = ab[j][1];
	                idx = j;
	            }
		        if(idx != i) {
		            long a = ab[i][0];
		            long b = ab[i][1];
		            ab[i][0] = ab[idx][0];
		            ab[i][1] = ab[idx][1];
		            ab[idx][0] = a;
		            ab[idx][1] = b;
		        }
		    }
		}
		String ans = "Yes";
		long sum = 0;
		for(int i=0; i<N; i++) {
		    sum += ab[i][0];
		    if(sum > ab[i][1]) {
		        ans = "No";
		        break;
		    }
		}
		System.out.println(ans);
	}
} 