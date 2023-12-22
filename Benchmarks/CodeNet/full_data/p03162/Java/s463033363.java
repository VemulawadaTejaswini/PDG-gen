import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static final int TASKS = 3;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] H = new int[N][TASKS];
		
		for(int i = 0; i < N ; i++) {
			String[] S = br.readLine().split(" ");
			H[i][0] = Integer.parseInt(S[0]);
			H[i][1] = Integer.parseInt(S[1]);
			H[i][2] = Integer.parseInt(S[2]);
		}
		
		int[] preCache = new int[TASKS];
		int[] currCache = new int[TASKS];
		
		for(int i = 0; i < TASKS; i++) {
			preCache[i] = H[0][i];
		}
		System.out.println(minCostJump(N, H, preCache, currCache));
	}
	
	public static int minCostJump(int N, int[][] H, int[] preCache, int[] currCache) {
		
		for(int i = 1; i < N ; i++) {
			for(int j = 0; j < TASKS; j++) {
				for(int k = 0; k < TASKS; k++) {
					if(j == k) continue;
					currCache[j] = Math.max(currCache[j], H[i][j]+ preCache[k]);
				}
			}
			preCache = currCache;
			currCache = new int[TASKS];
		}
		
	
		return Math.max(preCache[0], Math.max(preCache[1], preCache[2]));
	}
}
