import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACantWaitForHoliday solver = new ACantWaitForHoliday();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACantWaitForHoliday {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String s = in.next();
            if (s.equals("SUN")) out.println(7);
            else if (s.equals("MON")) out.println(6);
            else if (s.equals("TUE")) out.println(5);
            else if (s.equals("WED")) out.println(4);
            else if (s.equals("THU")) out.println(3);
            else if (s.equals("FRI")) out.println(2);
            else if (s.equals("SAT")) out.println(1);

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

