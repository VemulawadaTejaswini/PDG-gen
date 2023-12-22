import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in) );
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(reader.readLine() );
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

    public String nextLine() throws IOException {
        return reader.readLine();
    }
    
}
public class Main{
	public static void main(String args[]) throws IOException{
    	Reader.init();
      	int N=Reader.nextInt();
      	int K=Reader.nextInt();
      	int Q=Reader.nextInt();
      	int P[]=new int[N];
      	Arrays.fill(P, K);
      	
      	for(int i=0;i<Q;i++){
        	int winner=Reader.nextInt();
          	P[winner-1]++;
        }
      
      	for(int i=0;i<N;i++){
        	if(P[i]-Q>0){
            	System.out.println("Yes");
            }
          	else{
            	System.out.println("No");
            }
        }

    }      
}