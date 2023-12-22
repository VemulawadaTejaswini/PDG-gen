import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] H = new int[N+1][4];
		
		for(int i = 1; i <= N ; i++) {
			String[] S = br.readLine().split(" ");
			H[i][1] = Integer.parseInt(S[0]);
			H[i][2] = Integer.parseInt(S[1]);
			H[i][3] = Integer.parseInt(S[2]);
		}
		int[][] cache = new int[N+1][4];
		
		for(int i = 1; i <= N; i++) {
			Arrays.fill(cache[i], -1);
		}
		System.out.println(minCostJump(1, 0, N, H, cache));
	}
	
	public static int minCostJump(int day, int previousDay, int N, int[][] H, int[][] cache) {
		if(day > N) {
			return 0;
		}
		
		if(cache[day][previousDay] != -1) {
			return cache[day][previousDay];
		}
		
		int result = 0;
		for(int i = 1; i < 4; i++) {
			if(i != previousDay) {
				result = Math.max(result, H[day][i] + minCostJump(day+1, i, N, H, cache));
			}
		}
		
		
		cache[day][previousDay] = result;
		
		return result;
	}
}