import java.util.*;

public class Main{
	static final long MOD = 1000000007L;
	static final int WIDTH = 64;
	static final long[] BIN_EXPS = buildBinExps();
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	
	public static void main(String[] args){
		n = sc.nextInt();
		int[][] binaries = new int[n][WIDTH];
		for(int i = 0; i < n; ++i){
			binaries[i] = getBinary(sc.nextLong());
			
			//System.out.println(Arrays.toString(binaries[i]));
		}
		
		long ans = 0L;
		for(int iw = 0; iw < WIDTH; ++iw){
			long z = count0(binaries, iw);
			long prod = z * (n - z) % MOD;
			ans += prod * BIN_EXPS[iw] % MOD;
			ans %= MOD;
			//System.out.println("z = " + z + ", prod = " + prod + ", BIN = " + BIN_EXPS[iw] + ", ans = " + ans);
		}
		System.out.println(ans);
	}
	
	static long[] buildBinExps(){
		long[] res = new long[WIDTH];
		for(int i = 0; i < WIDTH; ++i){
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
	
	static long count0(int[][] binaries, int iw){
		long res = 0L;
		for(int id = 0; id < n; ++id){
			if(binaries[id][iw] == 0) ++res;
		}
		return res;
	}
}