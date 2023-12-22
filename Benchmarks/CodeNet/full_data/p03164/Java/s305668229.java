	import java.util.*;
	import java.io.*;
	public class Main {
		static int n,wi[],W,vi[];
		static long dp[][];
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				W=Integer.parseInt(tok.nextToken());
				
				wi=new int[n];
				vi=new int[n];
				int sm=0;
				for(int i=0;i<n;i++) {
					tok=new StringTokenizer(br.readLine()," ");
					wi[i]=Integer.parseInt(tok.nextToken());
					vi[i]=Integer.parseInt(tok.nextToken());
					sm+=vi[i];
				}
				dp=new long[n+1][sm+1];
				memset();
				printans.append(call(0,0,0));
			    
			}
			System.out.println(printans);
			
		}
		static void memset() {
			for(long a[]:dp) {
				Arrays.fill(a, -1);
			}
		}
static long call(int i,int v,int w) {
			
			if(i==n) {
				
				return v;
			}
		
			if(dp[i][v]!=-1) {
				return dp[i][v];
			}
			if(wi[i]+w>W) {
				dp[i][v]=call(i+1,v,w);
			}
			else {
				dp[i][v]=Math.max(call(i+1,v,w),call(i+1,v+vi[i],w+wi[i]));
			}
			
		
			return dp[i][v];
			
		}	
			
	}
