import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.Solve(in, out);
        out.close();
    }

    static class TaskC {

        public class TrainSegment {
            int startSpeed, endSpeed, maxSpeed, time;
            TrainSegment prev, next;


            public TrainSegment(int startSpeed, int endSpeed, int maxSpeed, int time) {
                this.maxSpeed = maxSpeed;
                this.startSpeed = startSpeed;
                this.endSpeed = endSpeed;
                this.time = time;
            }

            public TrainSegment(int maxSpeed, int time) {
                this(maxSpeed, maxSpeed, maxSpeed, time);
            }

            public void setPrev(TrainSegment prev) {
                this.prev = prev;
                prev.next = this;
                update();
            }

            public void update() {
                boolean needToUpdate = false;
                if (prev != null && startSpeed != prev.endSpeed) {
                    needToUpdate = true;
                    if (startSpeed < prev.endSpeed) {
                        prev.endSpeed = startSpeed;
                    } else {
                        startSpeed = prev.endSpeed;
                    }
                }

                if (next != null && endSpeed != next.startSpeed) {
                    needToUpdate = true;
                    if (endSpeed < next.startSpeed) {
                        next.startSpeed = endSpeed;
                    } else {
                        endSpeed = next.startSpeed;
                    }
                }
                if (startSpeed + time < endSpeed) {
                    endSpeed = startSpeed + time;
                    needToUpdate = true;
                } else if (endSpeed + time < startSpeed) {
                    startSpeed = endSpeed + time;
                    needToUpdate = true;
                }
                if (needToUpdate) {
                    update();
                    if (prev != null) prev.update();
                    if (next != null) next.update();
                }
            }

            public float getMeters() {
                int t1 = maxSpeed - startSpeed;
                int t2 = maxSpeed - endSpeed;
                if (t1 + t2 <= time) {
                    float res = (time - t1 - t2) * maxSpeed;
                    res += ((float) t1 * (startSpeed + maxSpeed)) / 2;
                    res += ((float) t2 * (endSpeed + maxSpeed)) / 2;
                    return res;
                } else {
                    int l = startSpeed;
                    int r = endSpeed;
                    if (l > r) {
                        int ttt = l;
                        l = r;
                        r = ttt;
                    }
                    float t = time;
                    float meters = 0;
                    if (l < r) {
                        t = r - l;
                        meters += (r + l) * t / 2;
                        l = r;
                        t = time - t;
                    }
                    meters += 2 * ((l + l + t / 2) * (t / 2) / 2);
                    return meters;
                }
            }
        }

        public void Solve(InputReader in, PrintWriter out) {
            int n = in.NextInt();
            int[] t = in.NextIntArray(n);
            int[] v = in.NextIntArray(n);
            TrainSegment[] ts = new TrainSegment[2 + n];
            ts[0] = new TrainSegment(0, 0);
            ts[ts.length - 1] = new TrainSegment(0, 0);
            for (int i = 0; i < n; i++) {
                ts[i + 1] = new TrainSegment(v[i], t[i]);
            }
            for (int i = 0; i <= n; i++) {
                ts[i + 1].setPrev(ts[i]);
            }
            for (TrainSegment segment : ts) segment.update();
            float sum = 0;
            for (TrainSegment segment : ts) {
                sum += segment.getMeters();
            }
            out.println(sum);
        }
    }

    public static int GetMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int a : ar) {
            max = Math.max(max, a);
        }
        return max;
    }

    public static int GetMin(int[] ar) {
        int min = Integer.MAX_VALUE;
        for (int a : ar) {
            min = Math.min(min, a);
        }
        return min;
    }

    public static long GetSum(int[] ar) {
        long s = 0;
        for (int a : ar) s += a;
        return s;
    }

    public static int[] GetCount(int[] ar) {
        return GetCount(ar, GetMax(ar));
    }

    public static int[] GetCount(int[] ar, int maxValue) {
        int[] dp = new int[maxValue + 1];
        for (int a : ar) {
            dp[a]++;
        }
        return dp;
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String Next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine(), " \t\n\r\f,");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int NextInt() {
            return Integer.parseInt(Next());
        }

        public long NextLong() {
            return Long.parseLong(Next());
        }

        public double NextDouble() {
            return Double.parseDouble(Next());
        }

        public int[] NextIntArray(int n) {
            return NextIntArray(n, 0);
        }

        public int[] NextIntArray(int n, int offset) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = NextInt() - offset;
            }
            return a;
        }

        public int[][] NextIntMatrix(int n, int m) {
            return NextIntMatrix(n, m, 0);
        }

        public int[][] NextIntMatrix(int n, int m, int offset) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = NextInt() - offset;
                }
            }
            return a;
        }
    }
}