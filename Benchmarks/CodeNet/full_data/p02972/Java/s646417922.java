import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPreparingBoxes solver = new DPreparingBoxes();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPreparingBoxes {
        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt();
            int[] a = new int[n];
        /*ArrayList<Integer>[] f=new ArrayList[n+1];
        for(int i=1;i<=n;i++) f[i]=new ArrayList<>();
        for(int i=2;i<=n;i++){
            f[i].add(1);
            for(int j=i<<1;j<=n;j++){
                f[j].add(i);
            }
        }*/
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
                if (a[i] == 1) ans.add(i + 1);
            }
            for (int i = 1; i <= n; i++) {
                if (a[i - 1] == 0) {
                    int c = 0;
                    for (int j = i << 1; j <= n; j += i) {
                        if (a[j - 1] == 1) c++;
                    }
                    if ((c & 1) == 1) {
                        w.println(-1);
                        return;
                    }
                }
            }
            w.println(ans.size());
            for (int i : ans) w.print(i + " ");
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

