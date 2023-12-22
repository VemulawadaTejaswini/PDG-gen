import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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

            out.format("%f%n", solveDt());
        }

        public double solveDt() {
            double left = 0;
            final double leftScore = score(left);
            double right = BinarySearch.binarySearchLong(r -> score(r) > leftScore);

            ASSERT(dscore(left) <= 0);
            ASSERT(dscore(right) >= 0);

            double mid = 0;
            while (true) {
                mid = (left + right) / 2;
                int d = dscore(mid);

//            System.out.println(String.format("%f %f %f %d", left, right, mid, d));
                if (d > 0)
                    right = mid;
                else if (d < 0)
                    left = mid;
                else
                    break;
            }

//        System.out.println(String.format("%f", mid));

            return score(mid);
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

        int dscore(double t) {
            double[] deltas = {1 + 1e-7,
                               1 + 1e-8,
                               1 + 1e-9,
                               1 + 1e-6,
                               1 + 1e-5,
                               1 + 1e-10,
                               1 + 1e-11,
                               1 + 1e-12,
                               1 + 1e-13,
                               1 + 1e-15,
                               1 + Double.MIN_VALUE};
            for (double delta : deltas) {
                double a = score(t / delta);
                double b = score(t);
                double c = score(t * delta);

                ASSERT(Double.isFinite(a));
                ASSERT(Double.isFinite(b));
                ASSERT(Double.isFinite(c));

                if (a < b && b < c) {
                    return 1;
                } else if (a > b && b > c) {
                    return -1;
                }
            }
            return 0;
        }

        static void apply(double[] coords, double input) {
            coords[0] = Math.min(coords[0], input);
            coords[1] = Math.max(coords[1], input);
        }

        private static void ASSERT(boolean assertion) {
            if (!assertion)
                throw new AssertionError();
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

    static class BinarySearch {
        public static long binarySearchLong(Function<Long, Boolean> bigEnough) {
            long tooSmall = 0, tooBig;
            if (bigEnough.apply(tooSmall)) {
                return tooSmall;
            }

            for (tooBig = 1; !bigEnough.apply(tooBig); tooBig *= 2)
                ;

            if (!bigEnough.apply(tooBig - 1)) {
                return tooBig;
            }

            while (tooBig - tooSmall > 1) {
                long center = (tooBig + tooSmall) / 2;
                if (!bigEnough.apply(center)) {
                    tooSmall = center;
                } else {
                    tooBig = center;
                }
            }

            return tooBig;
        }

    }
}

