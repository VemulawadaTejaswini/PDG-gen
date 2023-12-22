

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
            int k= in.nextInt();
            if (k%2!=0){
                long count=0;
                for (int i = 1; i <=n ; i++) {
                    if (i%k==0)count++;
                }
                System.out.println(count*count*count);
            }
            else{
                long ocount = 0;
                long count = 0;
                for (int i = 1; i <=n ; i++) {
                    if (i%k==0)count++;
                    else if(i%(k/2)==0){
                        ocount++;
                    }
                }
                long ans = count*count*count;
                ans+=ocount*ocount*ocount;
                System.out.println(ans);



            }

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