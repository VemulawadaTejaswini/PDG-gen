import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
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
                TaskA solver = new TaskA();
                solver.solve(1, in, out);
                out.close();
        }

        static class TaskA {
                public void solve(int testNumber, InputReader in, PrintWriter out) {
                        String s = in.s();
                        String s1 = in.s();
                        String s2 = in.s();
                        out.println(s.charAt(0) + "" + s1.charAt(1) + "" + s2.charAt(2));
                }

        }

        static class InputReader {
                InputStream is;
                private byte[] inbuf = new byte[1024];
                public int lenbuf = 0;
                public int ptrbuf = 0;

                public InputReader(InputStream is) {
                        this.is = is;
                }

                private int readByte() {
                        if (lenbuf == -1) throw new InputMismatchException();
                        if (ptrbuf >= lenbuf) {
                                ptrbuf = 0;
                                try {
                                        lenbuf = is.read(inbuf);
                                } catch (IOException e) {
                                        throw new InputMismatchException();
                                }
                                if (lenbuf <= 0) return -1;
                        }
                        return inbuf[ptrbuf++];
                }

                private boolean isSpaceChar(int c) {
                        return !(c >= 33 && c <= 126);
                }

                private int skip() {
                        int b;
                        while ((b = readByte()) != -1 && isSpaceChar(b)) ;
                        return b;
                }

                public String s() {
                        int b = skip();
                        StringBuilder sb = new StringBuilder();
                        while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
                                sb.appendCodePoint(b);
                                b = readByte();
                        }
                        return sb.toString();
                }

        }
}

