import java.util.*;

public class Main {
    static int n;
    static int[] aArr;
    static int[] bArr;
    static int[] cArr;
 	static int[][][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int ma = sc.nextInt();
		int mb = sc.nextInt();
		aArr = new int[n + 1];
		bArr = new int[n + 1];
		cArr = new int[n + 1];
		int amax = 0;
		int bmax = 0;
		for (int i = 1; i <= n; i++) {
		    aArr[i] = sc.nextInt();
		    bArr[i] = sc.nextInt();
		    cArr[i] = sc.nextInt();
		    amax += aArr[i];
		    bmax += bArr[i];
		}
		dp = new int[n + 1][401][401];
		int min = Integer.MAX_VALUE;
		for (int i = 1; ma * i <= amax && mb * i <= bmax; i++) {
		    min = Math.min(min, dfw(n, ma * i, mb * i));
		}
		if (min >= Integer.MAX_VALUE / 2) {
		    System.out.println(-1);
		} else {
		    System.out.println(min);
		}
   }
   
   static int dfw(int idx, int ma, int mb) {
       if (idx == 0 && ma == 0 && mb == 0) {
           return 0;
       }
       if (idx == 0 || ma < 0 || mb < 0) {
           return Integer.MAX_VALUE / 2;
       }
       if (dp[idx][ma][mb] != 0) {
           return dp[idx][ma][mb];
       }
       return dp[idx][ma][mb] = Math.min(dfw(idx - 1, ma, mb), dfw(idx - 1, ma - aArr[idx], mb - bArr[idx]) + cArr[idx]);
   }
}


