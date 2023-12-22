import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author dyominov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B3CardGameForThreeABCEdit solver = new B3CardGameForThreeABCEdit();
        solver.solve(1, in, out);
        out.close();
    }

    static class B3CardGameForThreeABCEdit {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String a = in.next();
            String b = in.next();
            String c = in.next();
            List<Character> listA = new LinkedList<>();
            List<Character> listB = new LinkedList<>();
            List<Character> listC = new LinkedList<>();
            for (char ch : a.toCharArray()) {
                listA.add(ch);
            }
            for (char ch : b.toCharArray()) {
                listB.add(ch);
            }
            for (char ch : c.toCharArray()) {
                listC.add(ch);
            }
            char s = (listA.isEmpty()) ? 'a' : listA.remove(0);
            while (true) {
                switch (s) {
                    case 'a': {
                        if (listA.isEmpty()) {
                            out.println("A");
                            return;
                        }
                        s = listA.remove(0);
                        break;
                    }
                    case 'b': {
                        if (listB.isEmpty()) {
                            out.println("B");
                            return;
                        }
                        s = listB.remove(0);
                        break;
                    }
                    case 'c': {
                        if (listC.isEmpty()) {
                            out.println("C");
                            return;
                        }
                        s = listC.remove(0);
                        break;
                    }
                }

            }
        }

    }

    static class InputReader implements AutoCloseable {
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

        public void close() {
        }

    }
}

