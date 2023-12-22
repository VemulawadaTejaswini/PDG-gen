import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
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
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            ArrayList<node> a = new ArrayList<node>();
            ArrayList<Long> ans = new ArrayList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            CustomAVL b = new CustomAVL();
            for (int i = 0; i < n; i++) {
                double s = in.nextInt();
                double t = in.nextInt();
                int x = in.nextInt();
                a.add(new node(s - x - 0.5, 0, x));
                a.add(new node(t - x - 0.5, 1, x));
            }
            Collections.sort(a, new Comparator<node>() {

                public int compare(node o1, node o2) {
                    if (Double.compare(o1.time, o2.time) != 0) {
                        return Double.compare(o1.time, o2.time);
                    } else if (o1.start != o2.start) {
                        return Double.compare(o1.start, o2.start);
                    } else {
                        return o1.x - o2.x;
                    }
                }
            });

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).start == 0) {
                    b.insertElement(a.get(i).x);
                } else {
                    b.deleteElement(a.get(i).x);
                }
                ans.add(b.getKthSmallest(1));
            }
//        for(int i=0;i<2*n;i++){
//            out.println(ans.get(i));
//        }
            for (int i = 0; i < q; i++) {
                int x = in.nextInt();
                int l = 0;
                int r = 2 * n - 1;
                while (l < r) {
                    int mid = (int) Math.ceil(((double) (l + r) / 2));
                    if (Double.compare(a.get(mid).time, x) > 0) {
                        r = mid - 1;
                    } else {
                        l = mid;
                    }
                }
                out.println(ans.get(l));
            }

        }

        class node {
            double time;
            int start;
            int x;

            node(double time, int start, int x) {
                this.time = time;
                this.start = start;
                this.x = x;
            }

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

        node minValueNode(node temp) {

            /* loop down to find the leftmost leaf */
            while (temp.left != null)
                temp = temp.left;

            return temp;
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

        public node delete(node root, long value) {
            if (root == null) {
                return root;
            }
            if (value < root.value) {
                root.lcount = root.lcount - 1;
                root.lsum = root.lsum - value;
                root.left = delete(root.left, value);
            } else if (value > root.value) {
                root.rcount = root.rcount - 1;
                root.rsum = root.rsum - value;
                root.right = delete(root.right, value);
            } else {
                if (root.left == null || root.right == null) {
                    node temp = null;
                    if (temp == root.left) temp = root.right;
                    else temp = root.left;
                    if (temp == null) {
                        temp = root;
                        root = null;
                    } else {
                        root = temp;
                    }

                } else {
                    node temp = minValueNode(root.right);
                    root.lsum = root.lsum - root.value;
                    root.rsum = root.rsum - value;
                    root.rcount = root.rcount - 1;
                    root.value = temp.value;
                    root.lsum = root.lsum + root.value;
                    root.right = delete(root.right, temp.value);
                }
            }
            if (root == null) {
                return root;
            }
            root.height = max(height(root.left), height(root.right)) + 1;
            int balance = getBalance(root);
            if (balance > 1 && getBalance(root.left) >= 0)
                return rightrotate(root);
            if (balance > 1 && getBalance(root.left) < 0) {
                root.left = leftrotate(root.left);
                return rightrotate(root);
            }
            if (balance < -1 && getBalance(root.right) <= 0)
                return leftrotate(root);
            if (balance < -1 && getBalance(root.right) > 0) {
                root.right = rightrotate(root.right);
                return leftrotate(root);
            }


            return root;
        }

        public void insertElement(long value) {
            this.root = insert(root, value);
        }

        public void deleteElement(long value) {
            this.root = delete(root, value);
        }

        public long getKthSmallest(int k) {
            node temp = root;

            while (temp != null) {
                if (temp.lcount == k) {
                    return temp.value;
                }
                if (temp.lcount > k) {
                    temp = temp.left;
                    continue;
                }
                if (temp.lcount < k) {
                    k = k - temp.lcount;
                    temp = temp.right;
                }
            }
            return -1;
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

