import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.*;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int N = in.nextInt();
            int a[] = new int[N];
            int res[] = new int[9];
            int res1[] = new int[9];

            int ans=0;
            int ans1 = 0;
            for(int i=0; i<N; i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            for(int i=0; i<N; i++){
                int div = a[i]/400;
                if(div<8){
                    res[div] = 1;
                    res1[div] = 1;
                }

                if(div>=8){
                    ans++;
                }
            }
            for(int i=0; i<9; i++){
                if(res[i]==1) ans++;
                if(res1[i]==1) ans1++;
            }

            out.print(Math.max(1,ans1)+" "+ans);
            out.println();
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