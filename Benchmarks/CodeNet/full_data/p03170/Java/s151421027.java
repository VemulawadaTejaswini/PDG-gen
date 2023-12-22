import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
static int min = Integer.MAX_VALUE;
	
	static int[][] cache;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int N = Integer.parseInt(S[0]);
		int K = Integer.parseInt(S[1]);
		
		int[] A = new int[N];
		
		S = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			A[i] = Integer.parseInt(S[i]);
			min = Math.min(min, A[i]);
		}
		
		cache = new int[2][K+1];
		Arrays.fill(cache[0], -1);
		Arrays.fill(cache[1], -1);
		
		String winner = winner(A, K) ? "First" : "Second";
		System.out.println(winner);
	}
	
	public static boolean winner(int[] A, int K) {
		int n = A.length;
		
		for(int i = 0; i < min; i++) {
			cache[0][i] = 1;
			cache[1][i] = 0;
		}
		
		for(int k = min; k <= K; k++) {
			for(int i = 0; i < n ; i++) {
				if(k-A[i] >=0 && cache[1][k-A[i]] == 0) {
					cache[0][k] = 0;
					break;
				}
			}
			
			if(cache[0][k] == -1) {
				cache[0][k] = 1;
			}
			for(int i = 0; i < n ; i++) {
				if(k-A[i] >=0 && cache[0][k-A[i]] == 1) {
					cache[1][k] = 1;
					break;
				}
			}
			
			if(cache[1][k] == -1) {
				cache[1][k] = 0;
			}
		}
		
		return cache[0][K] == 0;
	}
}
