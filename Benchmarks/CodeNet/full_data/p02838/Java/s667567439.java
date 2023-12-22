import java.util.*;

public class Main{
	static final long MOD = 1000000007L;
	static final int WIDTH = 64;
	static final long[] BIN_EXPS = buildBinExps(WIDTH);
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	
	public static void main(String[] args){
		n = sc.nextInt();
		int[][] binaries = new int[n][WIDTH];
		for(int i = 0; i < n; ++i){
			binaries[i] = getBinary(sc.nextLong());
			
			/*System.out.print("binaries[" + i + "] = ");
			for(int iw = 0; iw < WIDTH; ++iw){
				System.out.print(binaries[i][iw]);
				if(iw == WIDTH - 1) System.out.print('\n');
			}*/
		}
		
		long ans = 0L;
		for(int iw = 0; iw < WIDTH; ++iw){
			int z = count0(binaries, iw);
			//System.out.println("BIN_EXPS[" + iw + "] = " + BIN_EXPS[iw] + ", z = " + z);
			ans += (z * (n - z) % MOD) * (BIN_EXPS[iw] % MOD);
			ans %= MOD;
		}
		System.out.println(ans);
	}
	
	static long[] buildBinExps(int w){
		long[] res = new long[w];
		for(int i = 0; i < w; ++i){
			res[i] = (i == 0) ? 1L : 2L * res[i - 1] % MOD;
		}
		return res;
	}
	
	static int[] getBinary(long num){
		int[] res = new int[WIDTH];
		for(int i = 0; i < WIDTH; ++i){
			res[i] = (num % 2L == 1L) ? 1 : 0;
			num /= 2L;
		}
		return res;
	}
	
	static int count0(int[][] binaries, int iw){
		int res = 0;
		for(int id = 0; id < n; ++id){
			if(binaries[id][iw] == 0) ++res;
		}
		return res;
	}
}