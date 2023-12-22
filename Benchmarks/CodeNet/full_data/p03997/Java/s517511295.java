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
        int a;
        int b;
        int h;
        a = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        System.out.println(((a + b) * h) / 2);
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