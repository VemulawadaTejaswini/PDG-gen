import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
    	int N, M, Q;
    	int[][] range;
    	
    	int ans(int p, int q) {
    		int sum = 0;
    		for (int i = p; i <= q; ++i) {
    			sum += range[i][q] - range[i][p - 1];
    		}
    		return sum;
    	}
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	M = in.nextInt();
        	Q = in.nextInt();
        	
        	range = new int[N + 1][N + 1];
        	for (int i = 0; i <= N; ++i) Arrays.fill(range[i], 0);
        	
        	for (int i = 0; i < M; ++i) {
        		int l = in.nextInt();
        		int r = in.nextInt();
        		range[r][l]++;
        	}
        	
        	for (int i = 1; i <= N; ++i) {
        		for (int j = 1; j <= N; ++j) {
        			range[i][j] += range[i][j - 1];
        		}
        	}
        	
        	for (int i = 0; i < Q; ++i) {
        		int p = in.nextInt();
        		int q = in.nextInt();
        		out.println(ans(p, q));
        	}
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

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
