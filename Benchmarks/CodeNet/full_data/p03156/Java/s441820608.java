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
        	int A = in.nextInt();
        	int B = in.nextInt();
        	int[] P = new int[N];
        	int count1 = 0;
        	int count2 = 0;
        	int count3 = 0;
        	int ans = 0;
        	for(int i = 0; i < N; i++) {
        		P[i] = in.nextInt();
        		if(P[i] <= A) {
        			count1++;
        		}else if(A + 1 <= P[i] && P[i] <= B) {
        			count2++;
        		}else{
        			count3++;
        		}
        	}
        	ans = Math.min(count1, count2);
        	ans = Math.min(ans, count3);
        	out.println(ans);

        	

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

