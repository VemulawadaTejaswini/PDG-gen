import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long k = sc.nextLong();
        long[] h = new long[n];
        for (long i = 0; i < n; i++ ) {
          h[i] = sc.nextLong();
        }
        Arrays.sort(h)
		long f = 1000000000;
		//
		for ( long m = 0; m < n - k + 1; m++ ) {
          long t = h[m+k-1] - h[m];
          if (t<f) {
             f = t;
          }
        }
        System.out.println(f);
	}
}
