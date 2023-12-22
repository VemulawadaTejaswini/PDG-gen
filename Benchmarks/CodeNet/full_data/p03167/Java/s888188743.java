import java.io.*;
import java.util.*;
public class Main {
static int [][] dp;
static char [][]hw ;

static int h;
static int w;

	public static int solve(int a,int b){
		
		dp[h-1][w-1]=1;
			for(int i=h-2,j=w-1;i>=0;i--){
				if(hw[i][j]=='#'){
					dp[i][j]=0%((int)1e9+7);
				}
				else{
					dp[i][j]=dp[i+1][j]%((int)1e9+7);
			}}
		for (int j=w-2,i=h-1;j>=0;j--){
			if(hw[i][j]=='#'){
				dp[i][j]=0%((int)1e9+7);
			}
			else{
				dp[i][j]=dp[i][j+1]%((int)1e9+7);
			}
		}
		for(int i=h-2;i>=0;i--){
			for(int j=w-2;j>=0;j--){
				if(hw[i][j]=='#'){
					dp[i][j]=0%((int)1e9+7);
				}
				else{
				dp[i][j]=(dp[i+1][j]+dp[i][j+1])%((int)1e9+7);
			}
		}
		
	}
		return dp[a][b];
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		 h=sc.nextInt();
		 w=sc.nextInt();
		 hw=new char[h][w];
		 for(int i=0;i<h;i++){
			 hw[i]=sc.nextLine().toCharArray();}
		dp=new int[h][w];
for(int i=0;i<h;i++){
	Arrays.fill(dp[i], (-1));
}


		System.out.println(solve(0,0));
		
			
 }


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
	}}