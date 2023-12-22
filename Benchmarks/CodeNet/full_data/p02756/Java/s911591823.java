import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static PrintWriter out;

    public static void main(String[] args) throws IOException {
      	// O(n^2) time | O(n) space
        out = new PrintWriter(new OutputStreamWriter(System.out));
        CF_Reader in = new CF_Reader();

        Deque<Character> deque = new LinkedList<>();
        char[] arr = in.next().toCharArray();
        for (char ch: arr) deque.add(ch);
        int tests = in.intNext();
        for (int t = 0; t < tests; t++) {
            if (in.intNext() == 1) deque = reverseDeque(deque);
            else if (in.intNext() == 1) deque.addFirst(in.charNext());
            else deque.add(in.charNext());
        }
        for (Character ch: deque) out.print(ch);
        out.println();

        out.close();
    }

    static Deque<Character> reverseDeque(Deque<Character> deque) {
        Deque<Character> rDeque = new LinkedList<>();
        while (!deque.isEmpty()) rDeque.add(deque.pollLast());
        return rDeque;
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}
