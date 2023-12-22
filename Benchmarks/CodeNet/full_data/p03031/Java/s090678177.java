import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
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
    	int N, M, ans = 0;
    	int[][] switches;
    	int[] p;
    	
        void solve(InputReader in, PrintWriter out) {
            // write your code here
        	N = in.nextInt();
        	M = in.nextInt();
        	switches = new int[M][];
        	for (int i = 0; i < M; ++i) {
        		int k = in.nextInt();
        		switches[i] = in.nextIntArray(k);
        	}
        	p = in.nextIntArray(M);
        	
        	for (int i = 0; i < 1 << N; ++i) {
        		boolean flag = true;
        		for (int j = 0; j < M; ++j) {
        			int cnt = 0;
        			for (int sw : switches[j]) {
        				if ((i >> --sw & 1) == 1) cnt++;
        			}
        			flag &= cnt % 2 == p[j];
        		}
        		ans += flag ? 1 : 0;
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
