

import java.io.*;
import java.util.*;

public class Main {
	static final int N=(int)5005;
    public static void main(String[] args) {  
        InputStream sys=System.in;
        InputReader in=new InputReader(sys);
        PrintWriter out=new PrintWriter(System.out);
        int n=in.nextInt();
        if(n/100==n%10) out.println("Yes");
        else out.println("No");
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
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}