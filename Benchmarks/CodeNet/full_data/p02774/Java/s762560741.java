import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPairs solver = new DPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPairs {
        static ArrayList<Long> pos;
        static ArrayList<Long> neg;
        static int zero;
        static int[] nlast;
        static int[] plast;
        static int[] nfirst;
        static int[] pfirst;

        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            pos = new ArrayList<>();
            neg = new ArrayList<>();

            zero = 0;
            for (int i = 0; i < n; i++) {
                long x = sc.nextInt();
                if (x > 0) {
                    pos.add(x);
                } else if (x < 0) {
                    neg.add(x);
                } else
                    zero++;
            }
            nlast = new int[neg.size()];
            plast = new int[pos.size()];
            nfirst = new int[neg.size()];
            pfirst = new int[pos.size()];
            Collections.sort(pos);
            Collections.sort(neg);
            if (neg.size() > 0) {
                nlast[neg.size() - 1] = neg.size() - 1;
                for (int i = neg.size() - 2; i >= 0; i--) {
                    if (neg.get(i).longValue() == neg.get(i + 1)) {
                        nlast[i] = nlast[i + 1];
                    } else {
                        nlast[i] = i;
                    }
                }
            }
            if (pos.size() > 0) {
                plast[pos.size() - 1] = pos.size() - 1;
                for (int i = pos.size() - 2; i >= 0; i--) {
                    if (pos.get(i).longValue() == pos.get(i + 1)) {
                        plast[i] = plast[i + 1];
                    } else {
                        plast[i] = i;
                    }
                }
            }
            for (int i = 1; i < neg.size(); i++) {
                if (neg.get(i).longValue() == neg.get(i - 1)) {
                    nfirst[i] = nfirst[i - 1];
                } else {
                    nfirst[i] = i;
                }
            }
            for (int i = 1; i < pos.size(); i++) {
                if (pos.get(i).longValue() == pos.get(i - 1)) {
                    pfirst[i] = pfirst[i - 1];
                } else {
                    pfirst[i] = i;
                }
            }
            long nbneg = (long) pos.size() * neg.size();
            long nbzero = (long) pos.size() * zero + (long) neg.size() * zero + ((long) zero * (zero - 1)) / 2;
            if (k <= nbneg) {
                long l = (long) 1e18;
                long r = 1;
                while (l - r >= 0) {
                    long mid = (r + l) / 2;
                    int ret = check1(mid, k);
                    if (ret == 0) {
                        out.println(-mid);
                        return;
                    } else if (ret == 1) {
                        l = mid - 1;
                    } else {
                        r = mid + 1;
                    }
                }
            } else {
                k -= nbneg;
                if (k <= nbzero) {
                    out.println(0);
                    return;
                }
                k -= nbzero;
                long l = 1;
                long r = (long) 1e18;
                while (r - l >= 0) {
                    long mid = (r + l) / 2;
                    int ret = check2(mid, k);
                    if (ret == 0) {
                        out.println(mid);
                        return;
                    } else if (ret == 1) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }

        }

        private int check2(long mid, long k) {
            long min = 0;
            long max = 0;
            for (int i = 0; i < neg.size(); i++) {
                long need = mid / neg.get(i);
                int x = Collections.binarySearch(neg, need);
                if (x < 0) {
                    x++;
                    x *= -1;
                } else {
                    x = nfirst[x];
                }
                max += Math.min(neg.size() - x, neg.size() - 1 - i);
                if (mid % neg.get(i) == 0) {
                    if (x < neg.size())
                        x = nlast[x] + 1;
                    min += Math.min(neg.size() - x, neg.size() - 1 - i);
                } else {
                    min += Math.min(neg.size() - x, neg.size() - 1 - i);
                }

            }
            for (int i = 0; i < pos.size(); i++) {
                long need = mid / pos.get(i);
                int x = Collections.binarySearch(pos, need);
                if (x < 0) {
                    x++;
                    x *= -1;
                    max += Math.min(x, i);
                } else {
                    max += Math.min(plast[x] + 1, i);
                }
                long need2 = mid / pos.get(i);
                if (mid % pos.get(i) == 0) {
                    need2--;
                }
                int y = Collections.binarySearch(pos, need2);
                if (y < 0) {
                    y++;
                    y *= -1;
                } else {
                    y = plast[y] + 1;
                }
                min += Math.min(y, i);
            }
            if (k >= min + 1 && k <= max) {
                return 0;
            }
            if (k > max) {
                return 1;
            }
            return 2;
        }

        private int check1(long mid, long k) {
            long min = 0;
            long max = 0;
            for (int i = 0; i < pos.size(); i++) {
                long need = mid / pos.get(i);
                if (mid % pos.get(i) != 0) {
                    need++;
                }
                int x = Collections.binarySearch(neg, -need);
                int y;
                if (x < 0) {
                    x++;
                    x *= -1;
                    y = x;
                } else {
                    if (mid % pos.get(i) == 0) {
                        y = nfirst[x];
                    } else {
                        y = nlast[x] + 1;
                    }
                    x = nlast[x] + 1;
                }
                min += y;
                max += x;
            }
            if (k >= min + 1 && k <= max) {
                return 0;
            }
            if (k > max) {
                return 1;
            }
            return 2;
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

