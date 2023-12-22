/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] inp = reader.readLine().split(" ");
		int H = Integer.parseInt(inp[0]);
		int W = Integer.parseInt(inp[1]);
		int A = Integer.parseInt(inp[2]);
		int B = Integer.parseInt(inp[3]);
		long[][] dp = new long[H][W];
		for(int i = 0;i<H;i++){
		    dp[i][0] = 1;
		}
		for(int j = 0;j<W;j++){
		    dp[0][j] = 1;
		}
		for(int t = 0;t<A;t++){
		    for(int u=0;u<B;u++){
		        dp[H-1-t][u]=-1;
		    }
		}
		for(int z= 1;z<H;z++){
		    for(int x=1; x<W;x++){
		        if(dp[z][x]==-1) continue;
		        else{
		            if(dp[z-1][x]==-1) dp[z][x] = dp[z][x-1];
		            else if(dp[z][x-1]==-1) dp[z][x] =dp[z-1][x];
		            else{
		                dp[z][x] = dp[z-1][x]+dp[z][x-1];
		                if(dp[z][x] >= 1000000007) dp[z][x]-=1000000007;
		            }
		        }
		    }
		}
		System.out.println(dp[H-1][W-1]);
	}
}
