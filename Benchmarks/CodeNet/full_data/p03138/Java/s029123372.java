import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		boolean[] base = getBitArray(k);
		boolean[][] arrs = new boolean[n][];
		for (int i = 0; i < n; i++) {
		    arrs[i] = getBitArray(sc.nextLong());
		}
		long ans = 0;
		boolean start = false;
		for (int i = 40; i >= 0; i--) {
		    int count = 0;
		    for (int j = 0; j < n; j++) {
		        if (arrs[j][i]) {
		            count++;
		        }
		    }
	        if (start) {
	            ans += pow2(i, Math.max(count, n - count));
	        } else {
	            if (base[i]) {
	                if (count >= n / 2) {
	                    start = true;
	                }
	                ans += pow2(i, Math.max(count, n - count));
	            } else {
	                ans += pow2(i, count);
	            }
	        }
		}
	    System.out.println(ans);
   }
   
   static boolean[] getBitArray(long x) {
       boolean[] ans = new boolean[41];
       for (int i = 0; i < 41 && x > 0; i++) {
           ans[i] = (x % 2 == 1);
           x /= 2;
       }
       return ans;
   }
   
   static long pow2(int pow, long count) {
       long ans = 1;
       for (int i = 0; i < pow; i++) {
           ans *= 2;
       }
       return ans * count;
   }
}


