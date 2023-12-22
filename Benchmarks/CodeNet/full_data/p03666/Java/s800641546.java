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
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            int D = in.nextInt();

            int k = Math.abs(A-B);
            int m = k/D;
            int n = k%D;

            if(A==B){
                out.println("NO");
                return;
            }

            if(D==0){
                if(A==B){
                    out.println("YES");
                    return;
                }
                else{
                    out.println("NO");
                    return;
                }
            }
            // if(n>=C){
            //     n-=C;
            //     m++;
            // }
            int r = N-1-m;
            // out.println(r);
            // out.println(m);
            int t=0;
            if(r%2==1){
                if(C==D){
                    out.println("NO");
                    return;
                }
                if((n-C)%(C-D)==0) t = (n-C)/(C-D);
                else t = (n-C)/(C-D)+1;
                if(2*t<=r-1){
                    // out.println(t);
                    out.println("YES");
                    return;
                }
            }
            else{
                if(C==D){
                    if(n==0){
                        out.println("YES");
                        return;
                    }
                    out.println("NO");
                    return;
                }
                if(n%(D-C)==0) t = n/(D-C);
                else t = n/(D-C)+1;
                if(2*t<=r){
                    out.println("YES");
                    return;
                }
            }
            // out.println(t);
            out.println("NO");
            
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