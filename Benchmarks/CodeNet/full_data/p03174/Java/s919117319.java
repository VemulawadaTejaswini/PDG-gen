import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	long mod=1000000007;
	public long dp(long[][] arr,long[][] dp,int col,int row,int n ) {
		if(row>=n) {
			return 0;
		}
		if(dp[col][row]!=-1) {
			return dp[col][row];
		}
		if(row==n-1) {
			for(int i=0;i<n;i++) {
				if(arr[row][i]==1 && ((col)&((1<<(n-1-i))))>=1) {
					dp[col][row]=1;
					return 1;
				}
			}
			dp[col][row]=0;
			return 0;
		}
		long sum=0;
		for(int i=0;i<n;i++) {
			if(arr[row][i]==1 && ((col)&((1<<(n-1-i))))>=1) {
				
				sum+=this.dp(arr, dp,(col)&(~(1<<(n-1-i))) , row+1, n);
			}
		}
		sum%=mod;
		dp[col][row]=sum;
		return dp[col][row];
	}
	public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        Reader.init(System.in);
        int n=Reader.nextInt();
        
        long[][] dp=new long[(int)Math.pow(2, n)][n];
        int l=(int)Math.pow(2, n);
        long[][] arr=new long[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++)
        	arr[i][j]=Reader.nextInt();
        }
        for(int i=0;i<l;i++) {
        	for(int j=0;j<n;j++) {
        		dp[i][j]=-1;
        	}
        }
        Main mm=new Main();
        System.out.println(mm.dp(arr, dp,((int)Math.pow(2, n))-1,0, n));
		
	}
}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
