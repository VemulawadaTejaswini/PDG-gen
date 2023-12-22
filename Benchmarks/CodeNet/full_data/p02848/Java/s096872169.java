package AtCoder.C114;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {
    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static A.InputReader in = new A.InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

    public static void main(String[] args) {
        int n = in.NI();
        StringBuilder x = new StringBuilder(in.next());
        n = n%26;
        for (int i=0;i<x.length();i++) {
            char pcar = x.charAt(i);
            for (int j=0;j<n;j++){
                if (pcar =='Z') {
                    pcar = 'A';
                } else {
                    pcar++;
                }
            }

            x.setCharAt(i, pcar);
        }
        out.println(x.toString());
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

        public int NI() {
            return Integer.parseInt(next());
        }

        public long NL() {
            return Long.parseLong(next());
        }

    }


}
