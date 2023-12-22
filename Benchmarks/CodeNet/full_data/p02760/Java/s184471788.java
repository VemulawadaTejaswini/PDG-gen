//package AtCoder.ABC157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        int[][] q = new int[3][3];
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) q[i][j] = in.NI();
        int cou = in.NI();
        while (cou-->0) {
            int te = in.NI();
            for (int i=0;i<3;i++) for (int j=0;j<3;j++) {
                if (q[i][j]==te) q[i][j] = -1;
            }
        }

        int fl = 0;
        for (int i=0;i<3;i++) {
            if (q[i][0]==-1 && q[i][1]==-1 && q[i][2]==-1) fl = 1;
        }
        for (int j=0;j<3;j++) {
            if (q[0][j]==-1 && q[1][j]==-1 && q[2][j]==-1) fl = 1;
        }
        if (q[0][0]==-1 && q[1][1]==-1 && q[2][2]==-1) fl = 1;
        if (q[2][0]==-1 && q[1][1]==-1 && q[0][2]==-1) fl = 1;
        if (fl==1) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        out.close();
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);

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