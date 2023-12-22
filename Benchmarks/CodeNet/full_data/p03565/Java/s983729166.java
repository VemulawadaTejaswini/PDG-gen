import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args)throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Reader in = new Reader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Dubious solver = new Dubious();
        solver.solve(1, in, out);
        out.close();
    }

    static class Dubious {
        public void solve(int testNumber, Reader in, PrintWriter out) throws Exception {
            String encoded = in.readLine();
            String t = in.readLine();
            int lene = encoded.length();
            int lent = t.length();
            int i;
            boolean found;
            for (i = lene - lent; i >= 0; --i) {
                int c = 0;
                found = true;
                for (int j = i; j < encoded.length(); ++j) {
                    if ((encoded.charAt(j) != t.charAt(c)) && encoded.charAt(j) != '?') {
                        found = false;
                        break;
                    }
                    c++;
                }
                if (found) {
                    break;
                }
            }
            if (i < 0) {
                out.println("UNRESTORABLE");
            } else {
                String improved = encoded.substring(0, i) + t + encoded.substring(i + lent, lene);
                String ans = improved.replace('?', 'a');
                out.println(ans);
            }
        }

    }

    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public Reader(InputStream in) {
            din = new DataInputStream(in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[1000005]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}

