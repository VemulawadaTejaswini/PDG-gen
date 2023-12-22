import java.util.*;

public class Main {
    static final int SIZE = 40;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		boolean[] base = getArray(k);
		long[] nums = new long[n];
		boolean[][] arrs = new boolean[n][];
		for (int i = 0; i < n; i++) {
		    nums[i] = sc.nextLong();
		    arrs[i] = getArray(nums[i]);
		}
		boolean[] ans = new boolean[SIZE];
		boolean isFirst = true;
		for (int i = SIZE - 1; i >= 0; i--) {
		    if (isFirst && !base[i]) {
		        ans[i] = false;
		    } else {
		        int count = 0;
		        for (int j = 0; j < n; j++) {
		            if (arrs[j][i]) {
		                count++;
		            }
		        }
		        if (count * 2 >= n) {
		            ans[i] = false;
		            if (isFirst && base[i]) {
		                isFirst = false;
		            }
		        } else {
		            ans[i] = true;
		        }
		    }
		}
		long fin = 0;
		for (int i = SIZE - 1; i >= 0; i--) {
		    fin <<= 1;
		    if (ans[i]) {
		        fin++;
		    }
		}
		long total = 0;
		for (long x : nums) {
		    total += (x ^ fin);
		}
		System.out.println(total);
    }
    
    static boolean[] getArray(long x) {
        boolean[] ans = new boolean[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if (x % 2 == 1) {
                ans[i] = true;
            }
            x /= 2;
        }
        return ans;
    }
    
}

