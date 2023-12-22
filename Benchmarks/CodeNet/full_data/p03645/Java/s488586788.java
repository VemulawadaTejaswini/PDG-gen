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
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;

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
            int M = in.nextInt();
            int a[] = new int[M];
            int b[] = new int[M];
            int c[] = new int[M];
            int d[] = new int[M];
            int k=0;
            int j=0;
            for(int i=0; i<M; i++){
                a[i] = in.nextInt();
                b[i] = in.nextInt();
                if(a[i]==1){
                    c[k] = b[i];
                    k++;
                }
                if(b[i]==N){
                    d[j] = a[i];
                    j++;
                }
            }
            int res=0;
            for(int i=0; i<M; i++){
                if(c[i]==0){
                    break;
                }
                else{
                    for(int u=0; u<M; u++){
                        if(d[u]==0){
                            break;
                        }
                        if(c[i]==d[u]){
                            out.println("POSSIBLE");
                            return;
                        }
                    }
                }
            }
            out.println("IMPOSSIBLE");
            
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