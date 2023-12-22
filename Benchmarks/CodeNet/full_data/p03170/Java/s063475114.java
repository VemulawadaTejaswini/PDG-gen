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
		
		String winner = winner(A, K, 0) ? "First" : "Second";
		System.out.println(winner);
	}
	
	public static boolean winner(int[] A, int K, int player) {
		
		if(K < min) {
			return false;
		} 
		
		if(cache[player][K] != -1) {
			return cache[player][K] == player ? true : false;
		}
		
		int n = A.length;
		
		boolean result = false;
		for(int i = 0; i< n; i++) {
			if(!winner (A, K - A[i], 1 - player)) {
				result = true;
				break;
			}
		}
		
		cache[player][K] = result ? player : 1 - player;
		
		return result;
	}
}
