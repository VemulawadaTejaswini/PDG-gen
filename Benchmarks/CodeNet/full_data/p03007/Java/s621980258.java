import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSuccessiveSubtraction solver = new CSuccessiveSubtraction();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSuccessiveSubtraction {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int[] arr = s.nextIntArray(n);
            ArrayList<Integer> neg = new ArrayList<>();
            ArrayList<Integer> pos = new ArrayList<>();
            int zero = 0;
            CSuccessiveSubtraction.arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    neg.add(arr[i]);
                } else if (arr[i] == 0) {
                    zero++;
                } else {
                    pos.add(arr[i]);
                }
            }

            StringBuilder ans = new StringBuilder();

            if (neg.size() == 0) {
                if (zero != 0) {
                    if (pos.size() != 1 && pos.size() > 0) {
                        ans.append(0).append(" ").append(pos.get(pos.size() - 1)).append("\n");
                        neg.add(pos.remove(pos.size() - 1) * -1);
                        zero--;
                    }
                } else {
                    if (pos.size() > 2) {
                        ans.append(pos.get(0)).append(" ").append(pos.get(1)).append("\n");
                        neg.add(pos.get(0) - pos.get(1));
                        pos.remove(0);
                        pos.remove(0);
                    }
                }
            }

            if (pos.size() == 0) {
                if (zero != 0) {
                    if (neg.size() != 1 && neg.size() > 0) {
                        ans.append(0).append(" ").append(neg.get(neg.size() - 1)).append("\n");
                        pos.add(neg.remove(neg.size() - 1) * -1);
                        zero--;
                    }
                } else {
                    if (neg.size() > 2) {
                        ans.append(neg.get(1)).append(" ").append(neg.get(0)).append("\n");
                        pos.add(neg.get(1) - neg.get(0));
                        neg.remove(0);
                        neg.remove(0);
                    }
                }
            }


            if (pos.size() == 0 && neg.size() == 0) {
                while (zero != 1) {
                    ans.append(0).append(" 0\n");
                    zero--;
                }
                out.println("0\n");
                out.println(ans);
            } else if (pos.size() == 0 || neg.size() == 0) {
                if (pos.size() == 0) {
                    if (zero == 0) {
                        out.println(neg.get(0));
                    } else {
                        ans.append(0).append(" ").append(neg.get(0)).append("\n");
                        out.println(neg.get(0) * -1);
                        out.println(ans);
                    }
                } else {
                    ans.append(pos.get(0)).append(' ').append(0).append("\n");
                    out.println(pos.get(0));
                    out.println(ans);
                }
            } else {
                while (pos.size() != 1) {
                    int neg1 = neg.get(0);
                    int pos1 = pos.get(pos.size() - 1);
                    ans.append(neg1).append(" ").append(pos1).append("\n");
                    neg.set(0, neg1 - pos1);
                    pos.remove(pos.size() - 1);
                }

                while (neg.size() != 1) {
                    int pos1 = pos.get(0);
                    int neg1 = neg.get(neg.size() - 1);
                    ans.append(pos1).append(" ").append(neg1).append("\n");
                    pos.set(0, pos1 - neg1);
                    neg.remove(neg.size() - 1);
                }

                while (zero != 1 && zero > 0) {
                    ans.append("0 0\n");
                    zero--;
                }

                if (zero == 1) {
                    ans.append(pos.get(0)).append(" 0\n");
                }

                ans.append(pos.get(0)).append(" ").append(neg.get(0)).append("\n");
                out.println(pos.get(0) - neg.get(0));
                out.println(ans);
            }

        }

        private static class arrays {
            static void merge(int arr[], int l, int m, int r) {
                int n1 = m - l + 1;
                int n2 = r - m;
                int L[] = new int[n1];
                int R[] = new int[n2];
                for (int i = 0; i < n1; ++i)
                    L[i] = arr[l + i];
                for (int j = 0; j < n2; ++j)
                    R[j] = arr[m + 1 + j];
                int i = 0, j = 0;
                int k = l;
                while (i < n1 && j < n2) {
                    if (L[i] <= R[j]) {
                        arr[k] = L[i];
                        i++;
                    } else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }

                while (i < n1) {
                    arr[k] = L[i];
                    i++;
                    k++;
                }

                while (j < n2) {
                    arr[k] = R[j];
                    j++;
                    k++;
                }
            }

            static void sort(int arr[], int l, int r) {
                if (l < r) {
                    int m = (l + r) / 2;
                    sort(arr, l, m);
                    sort(arr, m + 1, r);
                    merge(arr, l, m, r);
                }
            }

            static void sort(int[] arr) {
                sort(arr, 0, arr.length - 1);
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; ++i) array[i] = nextInt();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

