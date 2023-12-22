import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.text.DecimalFormat;
import java.io.IOException;
import java.io.FileInputStream;
import java.text.NumberFormat;
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
        Speed solver = new Speed();
        solver.solve(1, in, out);
        out.close();
    }

    static class Speed {
        public void solve(int testNumber, Reader in, PrintWriter out) throws Exception {
            int n = in.nextInt();
            int[] time = new int[n + 1];
            int[] speed = new int[n + 2];
            speed[0] = 0;
            speed[n + 1] = 0;
            int totalTime = 0;
            for (int i = 1; i <= n; ++i) {
                time[i] = in.nextInt();
                totalTime += time[i];
            }
            for (int i = 1; i <= n; ++i) {
                speed[i] = in.nextInt();
            }
            //TODO use time[i]
            double previous = speed[0] * 1.0;
            double maxSpeed = 0;
            double dist = 0.0;
            for (int i = 1; i <= n; ++i) {
                int next = speed[i + 1];
                double minspeed = 0;
                double maxspeed = 0;
                if (next <= speed[i]) { // prev < currentspeed <= next
                    double low = next * 1.0;
                    double high = speed[i];
                    for (int it = 0; it < 20000; ++it) {
                        maxSpeed = (low + high) / 2.0;
                        double timerequired = (maxSpeed - previous) + (maxSpeed - next);
                        if (timerequired > time[i]) {
                            high = maxSpeed;
                        } else {
                            low = maxSpeed;
                        }
                    }
                    //minspeed = next;
                    //maxspeed = maxSpeed;
                    dist += ((0.5 * (maxSpeed - previous) * (maxSpeed - previous) + previous * (maxSpeed - previous)) +
                            ((0.5 * (maxSpeed - next) * (maxSpeed - next) + next * (maxSpeed - next))) +
                            ((maxSpeed) * (time[i] - (2 * maxSpeed - (previous + next)))));
                    previous = next;
                } else {
                    double low = previous;
                    double high = speed[i];
                    for (int it = 0; it < 20000; ++it) {
                        maxSpeed = (low + high) / 2.0;
                        double timerequired = (maxSpeed - previous);
                        if (timerequired > time[i]) {
                            high = maxSpeed;
                        } else {
                            low = maxSpeed;
                        }
                    }
                    //minspeed = previous;
                    //maxspeed = maxSpeed;
                    dist += ((0.5 * (maxSpeed - previous) * (maxSpeed - previous) + previous * (maxSpeed - previous))) +
                            ((time[i] - (maxSpeed - previous)) * maxSpeed);
                    previous = maxSpeed;
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.000000000000");
            String formatted = decimalFormat.format(dist);
            out.println(formatted);
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

