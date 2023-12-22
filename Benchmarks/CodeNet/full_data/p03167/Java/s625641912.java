import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	static int[][] xy;
	static long[][] memo;
	static int H;
	static int W;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		xy = new int[H][W];
		memo = new long[H][W];
	
		for (int i = 0; i < H; i++) {
			Arrays.fill(memo[i],-1L);
			s = br.readLine();
			for (int j = 0; j < W; j++) {
				if (s.charAt(j) == '.')
					xy[i][j] = 0;
				else
					xy[i][j] = 1;
				
			}
	
		}
		Long x=solve(0,0);
		x=x%((int)1e9+7);
		
		System.out.println(x);
	}

	public static Long solve(int x, int y) {
		if (x == H - 1 && y == W - 1)
			return 1L;

		Long answer = 0L;
		if (x < H - 1) {
			if (xy[x + 1][y] == 0) {
				if (memo[x + 1][y] != -1)
					answer += memo[x + 1][y];
				else {
					answer += solve(x + 1, y);
					memo[x + 1][y] = solve(x + 1, y);
				}
			}
		}
		if (y < W - 1) {
			if (xy[x][y + 1] == 0) {
				if (memo[x][y + 1] != -1)
					answer += memo[x][y + 1];
				else {
					answer += solve(x, y + 1);
					memo[x][y + 1] = solve(x, y + 1);
				}
			}
		}
		return answer;
	}
}
