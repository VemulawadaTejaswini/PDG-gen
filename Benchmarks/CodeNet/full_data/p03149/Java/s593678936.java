import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */

public class Main {
    public static void main(String[] args) {
        InputStream    inputStream    = System.in;
        OutputStream outputStream = System.out;
        InputReader    in                      = new InputReader(inputStream);
        PrintWriter      out                    = new PrintWriter(outputStream);
        Task                 solver               = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
    		int count1 = 0;
    		int count9 = 0;
    		int count7 = 0;
    		int count4 = 0;
        	for(int i = 0; i < 4; i++) {
        		int N = in.nextInt();
        		switch(N) {
        		case 1:
        			count1++;
        			break;
        		case 9:
        			count9++;
        			break;
        		case 7:
        			count7++;
        			break;
        		case 4:
        			count4++;
        			break;
        		}
        	}
        	String str = "NO";
        	if(count1 == 1 && count9 == 1 && count7 == 1 && count4 == 1) {
        		str = "YES";
        	}
        	out.println(str);
        }
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

    }
}

