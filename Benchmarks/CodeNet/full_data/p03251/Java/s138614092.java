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
        	int N = in.nextInt();
        	int M = in.nextInt();
        	int X = in.nextInt();
        	int Y = in.nextInt();
        	int[] x = new int[N + 1];
        	int[] y = new int[M + 1];
        	
        	for(int i = 0; i < N; i++) {
        		x[i] = in.nextInt();
        	}
        	x[x.length -1 ] = X;
        	for(int i = 0; i < M; i++) {
        		y[i] = in.nextInt();
        	}
        	y[y.length -1 ] = Y;
        	
        	Arrays.sort(x);
        	Arrays.sort(y);
        	
        	String str = "War";
        	for(int i = -100; i <= 100; i++) {
            	if(x[x.length - 1] < i && i <= y[0]) {
            		str = "No War";
            		break;
            	}
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

