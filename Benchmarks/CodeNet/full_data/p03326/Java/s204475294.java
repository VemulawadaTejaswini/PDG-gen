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
        static int[][] D = {
        		{1, 1, 1},
        		{-1, 1, 1},
        		{1, -1, 1},
        		{1, 1, -1},
        		{1, -1, -1},
        		{-1, 1, -1},
        		{-1, -1, 1},
        		{-1, -1, -1},
        };
        
        int N, M;
        long[][] cake;
        long ans = 0;
        
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	M = in.nextInt();
        	
        	cake = new long[N][3];
        	for (int i = 0; i < N; ++i) {
        		cake[i][0] = in.nextLong();
        		cake[i][1] = in.nextLong();
        		cake[i][2] = in.nextLong();
        	}
        	
        	for (int[] d : D) {
        		Arrays.sort(cake, (a, b) -> 
        			Long.signum(
        					(b[0]*d[0] + b[1]*d[1] + b[2]*d[2]) - 
        					(a[0]*d[0] + a[1]*d[1] + a[2]*d[2]))
        		);
        		long cur = 0;
        		for (int i = 0; i < M; ++i) {
        			cur += cake[i][0]*d[0] + cake[i][1]*d[1] + cake[i][2]*d[2];
        		}
        		ans = Math.max(cur, ans);
        	}
        	
        	out.println(ans);
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

        long nextLong() { return Long.parseLong(next()); }

        long[] nextLongArray(int n) {
        	long[] arr = new long[n];
        	for (int i = 0; i < n; ++i) {
        		arr[i] = nextLong();
        	}
        	return arr;
        }
    }
}
