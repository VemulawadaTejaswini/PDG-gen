import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class5Hmk {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int[][]F;
	public static void main(String args[]) throws IOException{
		//problem/dpf
		String s = next(), s2 = next(); int N = s.length(), M = s2.length();
		char[]F = new char[N]; for(int i = 0;i<N;i++) F[i] = s.charAt(i);
		char[]F2 = new char[M]; for(int i = 0;i<M;i++) F2[i] = s2.charAt(i);
		int[][]dp = new int[N+1][M+1];
		for(int i = 0;i<=N;i++){
			for(int j = 0;j<=M;j++){
				if(i==0||j==0){ dp[i][j] = 0;}
				else if(F[i-1]==F2[j-1]) dp[i][j]=dp[i-1][j-1]+1;
				else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int r = N, c = M, temp = dp[N][M]; char[]lcs = new char[temp];
		while(r>0&&c>0){
			if(F[r-1]==F2[c-1]){
				lcs[temp-1]=F[r-1];temp--; r--; c--;
			}else if(dp[r-1][c]>dp[r][c-1]){
				r--;
			}else c--;
		}
		for(int i = 0;i<dp[N][M];i++) System.out.print(lcs[i]);
	}
	static String next() throws IOException{
		while(st==null||!st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static long readLong() throws IOException{
		return Long.parseLong(next());
	}
}
