

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader.init(System.in);

		int n=Reader.nextInt();
		int k=Reader.nextInt();
		int[] h= new int[n+1];
		for(int i=1; i<=n; i++) {
			h[i]=Reader.nextInt();
		}
		
		int[] dp= new int[n+1];
		dp[1]=0;
		dp[2]= Math.abs(h[2]-h[1]);
		
		
		for(int i=3; i<=n; i++) {
			int mini= Integer.MAX_VALUE;

			for(int j=1; j<=k ; j++) {
				if((i-j)>=1)
			mini= Math.min(dp[i-j]+ Math.abs(h[i]-h[i-j]),
					mini);
			
			}
			dp[i]=mini;
		}
		System.out.println(dp[n]);
}
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {

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
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    



}
