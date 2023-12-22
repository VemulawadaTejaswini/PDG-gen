import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    new Solver().solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }, "Solver", 1l << 30).start();*/

        new Solver().solve();
    }
}

class Solver {
    IO io = new IO(System.in, System.out);

    int N, M;
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    void solve() throws Exception {
        int i, j, k;

        N = io.nextInt(); for (i = 1; i <= N; ++i) deque.addLast(i);
        M = io.nextInt();

        for (i = 0; !deque.isEmpty() && i < M; ++i) {
            int l = io.nextInt(), r = io.nextInt();

            while (!deque.isEmpty() && deque.peekFirst() < l)
                deque.pollFirst();
            while (!deque.isEmpty() && deque.peekLast() > r)
                deque.pollLast();
        }

        io.println(deque.size());

        io.flush();
    }
}


class IO {
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static BufferedWriter bw;


    IO(InputStream is, OutputStream os) {
        try {
            in = is;
            bw = new BufferedWriter(new OutputStreamWriter(os));
        } catch (Exception e) {
        }
    }

    IO(String inputFile, String outputFile) {
        try {
            in = new FileInputStream(inputFile);
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile)));
        } catch (Exception e) {
        }
    }

    int scan() throws Exception {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a) throws Exception {
        bw.write(a.toString());
    }

    void printsp(Object a) throws Exception {
        print(a);
        bw.write(" ");
    }

    void println() throws Exception {
        bw.write("\n");
    }

    void println(Object a) throws Exception {
        print(a);
        println();
    }

    void flush() throws Exception {
        bw.flush();
        bw.close();
    }
}