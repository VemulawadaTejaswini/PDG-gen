import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static class FastReader{
		BufferedReader br;
		StringTokenizer tok;
		
		FastReader(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			if(tok==null || (!tok.hasMoreTokens())) {
				try {
					tok = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tok.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(this.next());
		}
		String nextLine() {
			String s="";
			try {
				s = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return s;
		}
	}
	
	public static void main(String[] args) {
		FastReader fr=new FastReader();
		int n=fr.nextInt();
		int[][] arr=new int[n][3];
		for(int i=0; i<n; i++) {
			arr[i][0]=fr.nextInt();
			arr[i][1]=fr.nextInt();
			arr[i][2]=fr.nextInt();
		}
		
		int[][] dp=new int[n][3];
		dp[0]=arr[0];
		for(int i=1; i<n; i++) {
			for(int j=0; j<3; j++) {
				dp[i][j]=Integer.MIN_VALUE;
				for(int k=0; k<3; k++) {
					if(k!=j)
						dp[i][j]=Math.max(dp[i][j], dp[i-1][k]+arr[i][j]);
				}
			}
		}
		System.out.println(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));	
	}
}
