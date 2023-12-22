import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int[][] arr;
	static int[][] memo;
	static boolean f = false;
	static boolean t = false;
	static int OO = (int) 1e9 + 7;

	static int dp(int i , int k) {
		if (i == n )
			return 0;

		if(memo[k][i]!=-1)
			return memo[k][i];
		
		int ans = -OO;
		for(int j = 0 ;  j < 3 ; j++ ){
			if(j == k)
				continue;
			ans = Math.max(ans , arr[i][j] + dp(i+1, j));
		}
	
		return memo[k][i] = ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());

		arr = new int[n + 1][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		memo = new int[4][(int) 1e5 + 1];

		for (int i = 0; i < 4; i++)
			Arrays.fill(memo[i], -1);
		
		pw.print(dp(0 , 3));
		pw.close();
	}
}
