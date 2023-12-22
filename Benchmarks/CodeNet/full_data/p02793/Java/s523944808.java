import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
	    boolean[] base = new boolean[1000001];
	    base[0] = true;
	    base[1] = true;
	    int count = 0;
	    for (int i = 2; i < base.length; i++) {
	        if (base[i]) {
	            continue;
	        }
	        count++;
	        for (int j = 2; i * j < base.length; j++) {
	            base[i * j] = true;
	        }
	    }
	    int idx = 0;
	    int[] primes = new int[count];
	    for (int i = 0; i < count; i++) {
	        if (!base[i]) {
	            primes[idx] = i;
	            idx++;
	        }
	    }
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int[][] counts = new int[n][count];
		int[] lcms = new int[count];
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    for (int j = 0; j < count && x > 1; j++) {
		        while (x % primes[j] == 0) {
		            counts[i][j]++;
		            x /= primes[j];
		        }
		        lcms[j] = Math.max(lcms[j], counts[i][j]);
		    }
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
		    long num = 1;
		    for (int j = 0; j < count; j++) {
		        for (int k = 0; k < lcms[j] - counts[i][j]; k++) {
		            num *= primes[j];
		            num %= MOD;
		        }
		    }
		    ans += num;
		    ans %= MOD;
		}
		System.out.println(ans);
   }

}
