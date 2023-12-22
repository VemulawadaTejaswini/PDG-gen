import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FEnclosedPoints solver = new FEnclosedPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEnclosedPoints {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            node arr[] = new node[n];
            ArrayList<Integer> x = new ArrayList<>();
            ArrayList<Integer> y = new ArrayList<>();
            CustomAVL t = new CustomAVL();
            for (int i = 0; i < n; i++) {
                arr[i] = new node(in.nextInt(), in.nextInt());
                x.add(arr[i].x);
                y.add(arr[i].y);
            }
            Arrays.sort(arr, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    return o1.x - o2.x;
                }
            });
            Collections.sort(x);
            Collections.sort(y);
            long ans = 0;
            long mod = 998244353;
            long twon = Maths.power(2, n, mod);
            for (int i = 0; i < n; i++) {
                int left = Collections.binarySearch(x, arr[i].x);
                int right = n - left - 1;
                int down = Collections.binarySearch(y, arr[i].y);
                int up = n - down - 1;
                int ll = t.getElementsLessThanK(arr[i].y);
                int lr = down - ll;
                int ul = left - ll;
                int ur = up - ul;
//            out.println(left + " " + right + " " + up + " " + down + " " + ll + " " + lr + " " + ur + " " + ul + " ");
                long rc = Maths.power(2, right, mod);
                long lc = Maths.power(2, left, mod);
                long uc = Maths.power(2, up, mod);
                long dc = Maths.power(2, down, mod);
                long llc = Maths.power(2, ll, mod);
                long lrc = Maths.power(2, lr, mod);
                long urc = Maths.power(2, ur, mod);
                long ulc = Maths.power(2, ul, mod);
                ans += (twon - lc - rc - uc - dc + llc + lrc + urc + ulc - 1 + 5 * mod) % mod;
                ans %= mod;
                t.insertElement(arr[i].y);
            }
            out.println(ans);
        }

        class node {
            int x;
            int y;

            node(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class Maths {
        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }

    static class CustomAVL {
        node root;

        CustomAVL() {
            this.root = null;
        }

        public int height(node temp) {
            if (temp == null) {
                return 0;
            } else {
                return temp.height;
            }
        }

        public int getBalance(node temp) {
            if (temp == null) {
                return 0;
            } else {
                return height(temp.left) - height(temp.right);
            }
        }

        public int max(int a, int b) {
            return (a > b) ? a : b;
        }

        public node rightrotate(node y) {
            node x = y.left;
            node T2 = x.right;
            y.lsum = y.lsum - x.lsum;
            y.lcount = y.lcount - x.lcount;
            x.rsum = x.rsum + y.rsum;
            x.rcount = x.rcount + y.rcount;
            x.right = y;
            y.left = T2;
            y.height = max(height(y.left), height(y.right)) + 1;
            x.height = max(height(x.left), height(x.right)) + 1;

            return x;

        }

        public node leftrotate(node x) {
            node y = x.right;
            node T2 = y.left;
            y.lsum = y.lsum + x.lsum;
            y.lcount = y.lcount + x.lcount;
            x.rsum = x.rsum - y.rsum;
            x.rcount = x.rcount - y.rcount;
            y.left = x;
            x.right = T2;
            x.height = max(height(x.left), height(x.right)) + 1;
            y.height = max(height(y.left), height(y.right)) + 1;
            return y;
        }

        public node insert(node root, long value) {
            if (root == null) {
                return new node(value);
            }
            if (value <= root.value) {
                root.lcount = root.lcount + 1;
                root.lsum = root.lsum + value;
                root.left = insert(root.left, value);
            } else {
                root.rsum = root.rsum + value;
                root.rcount = root.rcount + 1;
                root.right = insert(root.right, value);

            }
            root.height = 1 + max(height(root.left), height(root.right));
            int balance = getBalance(root);

            //ll
            if (balance > 1 && value <= root.left.value) {
                return rightrotate(root);
            }
            //rr
            if (balance < -1 && value > root.right.value) {
                return leftrotate(root);
            }
            //lr
            if (balance > 1 && value >= root.left.value) {
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }
            //rl
            if (balance < -1 && value < root.right.value) {
                root.right = rightrotate(root.right);
                return leftrotate(root);
            }
            return root;
        }

        public void insertElement(long value) {
            this.root = insert(root, value);
        }

        public int getElementsLessThanK(long element) {
            node temp = root;
            int rank = 0;
            while (temp != null) {
                if (temp.value == element) {
                    rank += temp.lcount;
                    return rank - 1;
                }
                if (temp.value > element) {
                    temp = temp.left;
                    continue;
                } else {
                    rank += temp.lcount;
                    temp = temp.right;
                    continue;
                }

            }
            return rank;
        }

        class node {
            long value;
            int lcount;
            long lsum;
            long rsum;
            int rcount;
            int height;
            node left;
            node right;

            node(long value) {
                this.value = value;
                this.lcount = 1;
                this.lsum = this.value;
                this.left = null;
                this.right = null;
                this.height = 1;
                this.rsum = this.value;
                this.rcount = 1;
            }

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

