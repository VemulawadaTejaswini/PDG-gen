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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FMinimumBoundingBox solver = new FMinimumBoundingBox();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMinimumBoundingBox {
        double[] permanentX;
        double[] leftX;
        double[] rightX;
        double[] permanentY;
        double[] upY;
        double[] downY;
        double[] all;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();

            permanentX = new double[]{Double.POSITIVE_INFINITY,
                                      Double.NEGATIVE_INFINITY};
            leftX = new double[]{Double.POSITIVE_INFINITY,
                                 Double.NEGATIVE_INFINITY};
            rightX = new double[]{Double.POSITIVE_INFINITY,
                                  Double.NEGATIVE_INFINITY};
            permanentY = new double[]{Double.POSITIVE_INFINITY,
                                      Double.NEGATIVE_INFINITY};
            upY = new double[]{Double.POSITIVE_INFINITY,
                               Double.NEGATIVE_INFINITY};
            downY = new double[]{Double.POSITIVE_INFINITY,
                                 Double.NEGATIVE_INFINITY};
            all = new double[]{Double.POSITIVE_INFINITY,
                               Double.NEGATIVE_INFINITY};

            for (int i = 0; i < n; i++) {
                long x = in.nextInt(), y = in.nextInt();
                char d = in.next().charAt(0);
                apply(all, x);
                apply(all, y);
                switch (d) {
                    case 'L':
                        apply(permanentY, y);
                        apply(leftX, x);
                        break;
                    case 'R':
                        apply(permanentY, y);
                        apply(rightX, x);
                        break;
                    case 'U':
                        apply(permanentX, x);
                        apply(upY, y);
                        break;
                    case 'D':
                        apply(permanentX, x);
                        apply(downY, y);
                        break;
                }
            }

//        System.out.println(Arrays.toString(permanentX));
//        System.out.println(Arrays.toString(leftX));
//        System.out.println(Arrays.toString(rightX));
//        System.out.println(Arrays.toString(permanentY));
//        System.out.println(Arrays.toString(upY));
//        System.out.println(Arrays.toString(downY));

            out.format("%f%n", solveWrongWithZero());
        }

        public double solveWrongWithZero() {
            double answer = score(0);
            for (int i = 0; i <= 1; i++) {
                double[] t = new double[]{leftX[i] - permanentX[i],
                                          permanentX[i] - rightX[i],
                                          (leftX[i] - rightX[i]) / 2,
                                          downY[i] - permanentY[i],
                                          permanentY[i] - upY[i],
                                          (downY[i] - upY[i]) / 2};

                for (double time : t) {
                    if (time < 0 || !Double.isFinite(time))
                        continue;

                    double score = score(time);
                    if (!Double.isFinite(score))
                        continue;
                    answer = Math.min(answer, score(time));
                }
            }

            return answer;
        }

        double score(double t) {
            double xMin = Double.POSITIVE_INFINITY;
            xMin = Math.min(xMin, permanentX[0]);
            xMin = Math.min(xMin, leftX[0] - t);
            xMin = Math.min(xMin, rightX[0] + t);

            double xMax = Double.NEGATIVE_INFINITY;
            xMax = Math.max(xMax, permanentX[1]);
            xMax = Math.max(xMax, leftX[1] - t);
            xMax = Math.max(xMax, rightX[1] + t);

            double yMin = Double.POSITIVE_INFINITY;
            yMin = Math.min(yMin, permanentY[0]);
            yMin = Math.min(yMin, downY[0] - t);
            yMin = Math.min(yMin, upY[0] + t);

            double yMax = Double.NEGATIVE_INFINITY;
            yMax = Math.max(yMax, permanentY[1]);
            yMax = Math.max(yMax, downY[1] - t);
            yMax = Math.max(yMax, upY[1] + t);

            return Math.abs((yMax - yMin) * (xMax - xMin));
        }

        static void apply(double[] coords, double input) {
            coords[0] = Math.min(coords[0], input);
            coords[1] = Math.max(coords[1], input);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

