import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
            int maxgroup = 0;
            int mingroup = 1000000;
            for(int i=0; i<N; i++){
                a[i] = in.nextInt();
                if(a[i]>maxgroup) maxgroup = a[i];
                if(a[i]<mingroup) mingroup = a[i];
            }
            if(mingroup+1<maxgroup){
                out.println("No");
                return;
            }
            int res = 0;
            for(int i=1; i<N; i++){
                if(a[i-1]==maxgroup&&a[i]==maxgroup){
                    continue;
                }
                else res++;
            }
            if(res==0){
                if(maxgroup==N-1||N%maxgroup==0) out.println("Yes");
                else out.println("No");
                return;
            }
            if(maxgroup==res+1) out.println("Yes");
            else out.println("No");




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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}