import java.io.*;
import java.util.*;
 
public class Main {
	public static long count(long n)
	{
		long val = 5;
		long ct = 0;
		for(;n/val>=1;val=val*5)
		{
			ct+=(n/val);
		}
		return ct;
	}
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		long n = in.nextLong();
		boolean even = n%2==0;
		long ct1;
		if(even)
		{
			ct1 = count(n/2);
		}
		else
		{
			ct1=count(n);
			ct1-=count(n/2);
		}
		out.println(ct1);
        out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}