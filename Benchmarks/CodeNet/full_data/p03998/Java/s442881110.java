/**
 * Created by iainws on 4/09/16.
 */

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReaderMain in = new InputReaderMain(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskMain solver = new TaskMain();
        solver.solve(1, in, out);
        out.close();
    }
}

class TaskMain {
    public void solve(int taskNumber, InputReaderMain in, PrintWriter out) {
        String a;
        String b;
        String c;
        a = in.next();
        b = in.next();
        c = in.next();
        char q = a.charAt(a.length() - 1);
        while (true) {
            if (q == 'a') {
                if (a.length() == 0) {
                    System.out.println("A");
                    return;
                }
                q = a.charAt(a.length() - 1);
                a = a.substring(0, a.length() - 1);
                continue;
            }
            if (q == 'b') {
                if (b.length() == 0) {
                    System.out.println("B");
                    return;
                }
                q = b.charAt(b.length() - 1);
                b = b.substring(0, b.length() - 1);
                continue;
            }
            if (q == 'c') {
                if (c.length() == 0) {
                    System.out.println("C");
                    return;
                }
                q = c.charAt(c.length() - 1);
                c = c.substring(0, c.length() - 1);
                continue;
            }
        }
    }
}

class InputReaderMain {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReaderMain(InputStream stream) {
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