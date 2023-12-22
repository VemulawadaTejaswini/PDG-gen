import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static long [][]dp;
	static int H, W;
	static int []bit;
	static List<int []> list = new ArrayList<int []>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		if(W == 1) {
			if(K == 1) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			System.exit(0);
		}
		long mod = 1000000007;
		dp = new long[H + 1][W];
		dp[0][0] = 1;
		bit = new int[W - 1];
		rec(0);
		int l = list.size();
		for(int i = 1; i <= H; i++) {
			for(int j = 0; j < l; j++) {
				int []b = list.get(j);
				long []c = swap(dp[i - 1], b);
				for(int k = 0; k < W; k++) {
					dp[i][k] += c[k];
					dp[i][k] %= mod;
				}
			}
		}
		System.out.println(dp[H][K - 1]);
//		for(int i = 0; i <= H; i++) {
//			for(int j = 0; j < W; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < l; i++) {
//			int []b = list.get(i);
//			for(int j : b) {
//				System.out.printf("%d ", j);
//			}
//			System.out.println();
//		}
	}
	static void disp(long []a) {
		for(long i : a) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	static long[] swap(long []a, int []b) {
		long []c = new long[W];
		System.arraycopy(a, 0, c, 0, W);
		for(int i = 0; i < W - 1; i++) {
			if(b[i] == 1) {
				c[i] = a[i + 1];
				c[i + 1] = a[i];
			}
		}
		return c;
	}
	static void rec(int k) {
        if(k == bit.length) {
        	addBit();
            return;
        }
        rec(k + 1);
        bit[k] = 1;
        rec(k + 1);
        bit[k] = 0;
    }
	static void addBit() {
		int l = bit.length;
		for(int i = 1; i < l; i++) {
			if(bit[i - 1] == 1 && bit[i] == 1) {
				return;
			}
		}
		int []vBit = new int[l];
		System.arraycopy(bit, 0, vBit, 0, l);
		list.add(vBit);
		return;
	}
}