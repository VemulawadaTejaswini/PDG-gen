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
		int w=Reader.nextInt();
		long ans=0;
		long[][] arr=new long[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=Reader.nextLong();arr[i][1]=Reader.nextLong();
		}
		long[][] val=new long[2][100001];
		for(int i=0;i<=1;i++) Arrays.fill(val[i], (long)Math.pow(10, 15));
		val[0][0]=0;
		val[1][0]=0;
		
		for(int i=0;i<n;i++) {
			int v=(int)arr[i][1];
			int last=1-i%2;
			int now=i%2;
			for(int j=0;j+v<100001;j++) {
				val[now][j+v]=Math.min(val[last][j+v], val[last][j]+arr[i][0]);
			}
			for(int j=0;j<100001;j++) val[last][j]=val[now][j];
		}
		for(int i=100000;i>=0;i--) {
			if(val[i%2][i]<=w) {
				ans=i;break;
			}
		}
		output.append(ans);
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
