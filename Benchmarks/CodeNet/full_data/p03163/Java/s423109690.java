	import java.util.*;
	import java.io.*;
	public class Main {
		static int n,wi[],W;
		static long dp[][],vi[];
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
				vi=new long[n];
				int sm=0;
				for(int i=0;i<n;i++) {
					tok=new StringTokenizer(br.readLine()," ");
					wi[i]=Integer.parseInt(tok.nextToken());
					vi[i]=Long.parseLong(tok.nextToken());
				
				}
				dp=new long[n+1][W+1];
				memset();
				printans.append(call(n-1,W));
			    
			}
			System.out.println(printans);
			
		}
		static void memset() {
			for(long a[]:dp) {
				Arrays.fill(a, -1);
			}
		}
		static long call(int i,int W) {
			
			 if (i < 0) 
			        return 0; 
			    if (dp[i][W] != -1) 
			        return dp[i][W]; 
			  
			    if (wi[i] > W) { 
			  
			        // store the value of function call stack in  
			        // table before return 
			        dp[i][W] = call(i - 1, W); 
			        return dp[i][W]; 
			    } 
			    else { 
			  
			        // store value in a table before return 
			        dp[i][W] = Math.max(vi[i] +call(i - 1,W - wi[i]), call(i - 1,W)); 
			  
			        // return value of table after storing 
			        return dp[i][W]; 
			
		}
			
			
	}
	}
	
