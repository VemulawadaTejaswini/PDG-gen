import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		StringBuffer output=new StringBuffer("");
		PrintWriter out=new PrintWriter(System.out);
		int n=Reader.nextInt();
		int k=Reader.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=Reader.nextInt();
		int[] cost=new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[0]=0;
		if(n>1) {
		cost[1]=Math.abs(arr[1]-arr[0]);
		for(int i=2;i<n;i++) {
			for(int j=i-1;j>=Math.max(0, i-k);j--) {
				cost[i]=Math.min(cost[i], Math.abs(arr[i]-arr[j])+cost[j]);
			}
		}
		}
		output.append(cost[n-1]);
		out.write(output.toString());
		out.flush();
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
    static String nextLine() throws IOException{
    	return reader.readLine();
    }
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
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
