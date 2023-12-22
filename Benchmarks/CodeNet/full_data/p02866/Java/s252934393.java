import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long mod = 998244353;
		long[] depthCnt = new long[N+1]; 
		int max = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			depthCnt[x]++;
			max=Math.max(max, x);
		}
		long ans = 1;
		for (int depth = 1; depth <= max; depth++){ //Starting from 1 since depth 0 must always 
			//be predecessor
			long numPrev = depthCnt[depth-1]; //Base of exponent
			long numCur = depthCnt[depth]; //Power of exponent
			long curans = FastExp(numPrev,numCur,mod);
			ans*=curans;
			ans%=mod;
		} 
		System.out.println(ans);
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans = 1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			base*=base;
			exp/=2;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
}