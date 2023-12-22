import java.io.*;

public class Main {

    public static void main(String[] args) {
	    InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        TaskC solver = new TaskC();
        solver.solve(in, out);
        out.close();
    }

    static class TaskC {
        public void solve(InputReader in, PrintWriter out) {
            //x + y + z = N
            //10000x + 5000y + 1000z = Y
            //z = N - x - y => 9000x + 4000y = Y - 1000N

            int bills = in.nextInt();
            int yen   = in.nextInt();
            boolean exists = false;
            int x, y, z;
            x = y = 0;
            loop: for(; x <= bills; x++) {
                for(y = 0; y <= bills - x; y++) {
                    if((9000 * x + 4000 * y) == (yen - 1000 * bills)) {
                        exists = true;
                        break loop;
                    }
                }
            }

            z = bills - x - y;
            if(exists)
                out.println(x + " " + y + " " + z);
            else
                out.println(-1 + " " + (-1) + " " + (-1));
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public String[] input;
        public int current;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            input = null;
            current = 0;
        }

        public String next() {
            while (input == null || current == input.length) {
                try {
                    current = 0;
                    input = reader.readLine().split("\\s");
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }

            return input[current++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
