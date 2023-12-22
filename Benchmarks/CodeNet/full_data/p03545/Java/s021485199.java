import java.io.*;
import java.lang.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    static InputReader in = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = in.next();
        int[] a = new int[4];
        for(int i = 0; i<4; i++){
            a[i] = Integer.parseInt(s.substring(i,i+1));
        }
        boolean check = true;
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                for(int k = 0; k<2; k++){
                    int sum = a[0];
                    String[] c = new String[3];
                    if(i==0){
                        sum += a[1];
                        c[0] = "+";
                    }
                    else{
                        sum -= a[1];
                        c[0] = "-";
                    }
                    if(j==0){
                        sum += a[2];
                        c[1] = "+";
                    }
                    else{
                        sum -= a[2];
                        c[1] = "-";
                    }if(k==0){
                        sum += a[3];
                        c[2] = "+";
                    }
                    else{
                        sum -= a[3];
                        c[2] = "-";
                    }
                    if(sum==7){
                        out.println(a[0] + c[0] + a[1] + c[1] + a[2] + c[2] + a[3]+"=7");
                        check = false;
                        break;
                    }
                }
                if(!check) break;
            }
            if(!check) break;
        }
        out.close();
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return reader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = reader.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            tokenizer = new StringTokenizer(next);
            return true;
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
    }
}

