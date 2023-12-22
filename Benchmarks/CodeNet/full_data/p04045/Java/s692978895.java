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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Reader in, PrintWriter out) throws Exception {
            int n = in.nextInt();
            String s = Integer.toString(n);
            int k = in.nextInt();
            boolean[] dislike = new boolean[10];
            for (int i = 0; i < k; ++i) {
                int d = in.nextInt();
                dislike[d] = true;
            }
            boolean flag = true;
            String result = "";
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (dislike[ch - 48]) {
                    if (flag) {
                        int start = ch - 48;
                        for (int j = start + 1; j < 10; ++j) {
                            if (!dislike[j]) {
                                result += j;
                                break;
                            }
                        }
                        flag = false;
                    } else {
                        for (int j = 0; j < 10; ++j) {
                            if (!dislike[j]) {
                                result += j;
                                break;
                            }
                        }
                    }
                } else {
                    result += ch;
                }
            }
            out.println(result);
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

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
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

