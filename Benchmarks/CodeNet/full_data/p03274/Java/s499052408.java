import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
	    long[] x = new long[n+1];
	    boolean iszero = true;
	    long a = 0;
	    for(int i=0; i<n; i++) {
	        a = Long.parseLong(sc.next());
            x[i] = a;
	    }
	    long l, r;
	    long min = (long)Math.pow(10, 9)+7;
	    long count = 0;
	    for(int i=0; i<n-k; i++) {
	        l = x[i];
	        r = x[i+k-1];

            count = Math.min(Math.abs(l)+Math.abs(r-l), Math.abs(r)+Math.abs(r-l));

	        min = Math.min(min, count);
	    }
	    
	    if(min == (long)Math.pow(10, 9)+7) min = 0;
	    System.out.println(min);
    }
    
}