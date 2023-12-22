
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskD {
        static long x ;
        static long y ;
        static long x1;
        static long y1;
        static long gcd(long a , long b){
            if (a==0){
                x1 = 0;
                y1 = 1;
                return b;
            }
            long g = gcd(b%a , a);
            x = y1-(b/a)*x1;
            y = x1;
            x1 = x;
            y1 = y;
            return g;
        }
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long sum= 0;
            int count = 0;
            long ans1= 0;
            long ans2 = 0;
            int[] arr = new int[n];
            for (int i = 1; i <=n; i++) {
                arr[i-1]=in.nextInt();
                sum+=arr[i-1]-i;
                count++;
            }
            long b1 = (long) Math.floor(sum/(double)count);
            long b2 = (long) Math.ceil(sum/(double)count);
            for (int i = 1; i <=n; i++) {
                ans1+=Math.abs(arr[i-1]-(b1+i));
                ans2+=Math.abs(arr[i-1]-(b2+i));
            }
            System.out.println(Math.min(ans1,ans2));




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
        public int nextInt(){return  Integer.parseInt(next());}
        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}