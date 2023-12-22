import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next(
    		) throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
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
}


public class Main {

	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
      	int N=Reader.nextInt();
      	long K=Reader.nextLong();
      	int A[]=new int[N];
      	for(int i=0;i<N;i++) {
          A[i]=Reader.nextInt();
      	}
      	long sum=0;
      	long ans=0;
      	int i=0;	
      	int j=0;
      	while(true){
          	if(sum>=K){
            	ans+=N-i+1;
//              	System.out.println("Sum : "+sum+", i : "+i);
//              	System.out.println("Ans : "+ans);
              	sum-=A[j++];	
            }
          	else{
              	if(i==N)
                  break;
            	sum+=A[i++];
            }
          	
        }
      	System.out.println(ans);

	}

}