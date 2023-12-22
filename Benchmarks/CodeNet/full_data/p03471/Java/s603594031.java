import java.io.*;
import java.util.Arrays;

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
            int bills = in.nextInt();
            int total = in.nextInt();
            solveIt(bills, total, in, out);
        }

        private void solveIt(int bills, int total, InputReader in, PrintWriter out) {
            //10k || 5k || 1k
            int x, y, z;
            x = y = z = 0;
            final int tenK = 10000;
            final int fiveK = 5000;
            final int oneK = 1000;
            while(total > 0 && bills > 0) {
                if((total - tenK) >= 0) {
                    total -= tenK;
                    x++;
                    bills--;
                }
                else if((total - fiveK) >= 0) {
                    total -= fiveK;
                    y++;
                    bills--;
                }
                else if((total - oneK) >= 0) {
                    total -= oneK;
                    z++;
                    bills--;
                }
                else break;
            }

            if(bills == 0 && total == 0)
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