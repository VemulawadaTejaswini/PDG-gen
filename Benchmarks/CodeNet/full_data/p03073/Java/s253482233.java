import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        void solve(InputReader in, PrintWriter out) {
        	String S = in.next();
        	
        	int ans1 = 0;
        	for (int i = 0; i < S.length(); ++i) {
        		if ((i % 2 == 1 && S.charAt(i) == '0') || (i % 2 == 0 && S.charAt(i) == '1')) {
        			++ans1;
        		}
        	}
        	
        	int ans2 = 0;
        	for (int i = 0; i < S.length(); ++i) {
        		if ((i % 2 == 0 && S.charAt(i) == '0') || (i % 2 == 1 && S.charAt(i) == '1')) {
        			++ans2;
        		}
        	}
        	
        	out.print(Math.min(ans1, ans2));
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i) arr[i] = this.nextInt();
            return arr;
        }
    }
}
