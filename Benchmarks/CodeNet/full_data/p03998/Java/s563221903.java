import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            List<Character> alice = new ArrayList<>();
            List<Character> bob = new ArrayList<>();
            List<Character> charlie = new ArrayList<>();
            for (char x : in.next().toCharArray()) alice.add(x);
            for (char x : in.next().toCharArray()) bob.add(x);
            for (char x : in.next().toCharArray()) charlie.add(x);
            char next = alice.get(0);
            boolean ans = true;

            while (ans) {
                switch (next) {
                    case 'a':
                        if (alice.size() == 0) {
                            out.println("A");
                            return;
                        }
                        next = alice.get(0);
                        alice.remove(0);
                        break;
                    case 'b':
                        if (bob.size() == 0) {
                            out.println("B");
                            return;
                        }
                        next = bob.get(0);
                        bob.remove(0);
                        break;
                    case 'c':
                        if (charlie.size() == 0) {
                            out.println("C");
                            return;
                        }
                        next = charlie.get(0);
                        charlie.remove(0);
                        break;
                }
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

    }
}

