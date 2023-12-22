	import java.util.*;
	import java.io.*;
class Main{
		static int n,arr[][],k	;
		static long dp[][],W;
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				W=0;
				arr=new int[n][3];
				
				for(int i=0;i<n;i++) {
					tok=new StringTokenizer(br.readLine()," ");
					arr[i][0]=Integer.parseInt(tok.nextToken());
					arr[i][1]=Integer.parseInt(tok.nextToken());
					arr[i][2]=Integer.parseInt(tok.nextToken());
				
				}
				dp=new long[n][3];
				memset();
				call(n-2);
				printans.append(Math.max(dp[0][0], Math.max(dp[0][1],dp[0][2])));
			    
			}
			System.out.println(printans);
			
		}
		static void memset() {
			for(long a[]:dp) {
				Arrays.fill(a, -1);
			}
			dp[n-1][0]=arr[n-1][0];
			dp[n-1][1]=arr[n-1][1];
			dp[n-1][2]=arr[n-1][2];
		}
		static void call(int i) {
			if(i<0) {
				return;
			}
			
			long ans=0;
			
			
			dp[i][0]=arr[i][0]+Math.max(dp[i+1][1],dp[i+1][2]);
			dp[i][1]=arr[i][1]+Math.max(dp[i+1][0],dp[i+1][2]);
			dp[i][2]=arr[i][2]+Math.max(dp[i+1][0],dp[i+1][1]);
			call(i-1);
			
			
			
			
		}
			
			
	}
