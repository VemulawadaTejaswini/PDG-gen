import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[][] cache;
	static final int MOD = 1000000007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int K = Integer.parseInt(S[1]);
		
		int[] A = new int[N];
		
		S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			A[i] = Integer.parseInt(S[i]);
		}
		
		cache = new int[N][K+1];
		
		for(int i = 0; i < N; i++) {
			cache[i][0]  = 1;
		}
		
		int temp =  Math.min(K, A[0]);
		for(int i = 1 ; i <= temp; i++) {
			cache[0][i] = 1;
		}
		
		System.out.println(ways(A, K));
	}
	
	public static int ways(int[] A, int K) {
		int N = A.length;
		
		for(int i = 1; i < N ; i++) {
			for(int k = 1; k <= K; k++) {
				int result = 0;
				int temp =  Math.min(k, A[i]);
				
				for(int j = 0; j <= temp; j++) {
					result = (result + cache[i-1][k-j]) % MOD;
				}
				cache[i][k] = result;
			}
		}
		
		return cache[N-1][K];
	}
}
