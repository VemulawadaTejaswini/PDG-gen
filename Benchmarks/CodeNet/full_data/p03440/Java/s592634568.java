import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] cost = in.na(n);
            DSList d = new DSList(n);
            while (m-- > 0) {
                d.union(in.nextInt(), in.nextInt());
            }
            PriorityQueue<AList> dd = new PriorityQueue<>((t1, t2) -> -Integer.compare(t1.size(), t2.size()));
            for (int i = 0; i < n; i++) {
                if (d.root(i) == i) {
                    AList price = new AList();
                    for (int k : d.val(i)) {
                        price.add(cost[k]);
                    }
                    price.rsort();
                    dd.add(price);
                }
            }
            int def = dd.size() * 2 - 2;
            if (def > n) {
                out.println("Impossible");
                return;
            }
            long res = 0;
            while (dd.size() > 1) {
                AList f1 = dd.poll();
                AList f2 = dd.poll();
                res += f1.pollLast() + f2.pollLast();
                f1 = f1.merge(f2);
                f1.rsort();
                dd.add(f1);
            }
            out.println(res);
        }

    }

    static class AList implements Iterable<Integer> {
        int[] data;
        int size = 0;

        public AList(int n) {
            this.data = new int[Math.max(Integer.highestOneBit(n - 1) << 1, 4)];
        }

        public AList() {
            this(4);
        }

        public AList(int[] data) {
            this(data.length);
            System.arraycopy(data, 0, this.data, 0, data.length);
        }

        public void rsort() {
            sort();
            reverse();
        }

        public void reverse() {
            for (int s = 0; s < size / 2; s++) {
                swap(s, size - s - 1);
            }
        }

        public void swap(int l, int f) {
            int t = data[l];
            data[l] = data[f];
            data[f] = t;
        }

        public void sort() {
            Arrays.sort(data, 0, size);
        }

        public void add(int k) {
            if (size == data.length) {
                data = Arrays.copyOf(data, data.length << 1);
            }
            data[size++] = k;
        }


        public Iterator<Integer> iterator() {
            int[] m = new int[1];
            return new Iterator<Integer>() {

                public boolean hasNext() {
                    return m[0] < AList.this.size;
                }


                public Integer next() {
                    return AList.this.data[m[0]++];
                }
            };
        }


        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(data[i]).append(' ');
            }
            return sb.toString();
        }

        public int size() {
            return size;
        }

        public int last() {
            return data[size - 1];
        }

        public int pollLast() {
            int t = last();
            removeLast();
            return t;
        }

        public void removeLast() {
            size--;
        }

        public void addAll(AList other) {
            int nl = data.length;
            while (nl < data.length + other.data.length) {
                nl <<= 1;
            }
            if (nl != data.length) {
                data = Arrays.copyOf(data, nl);
            }
            System.arraycopy(other.data, 0, data, size, other.size);
            size += other.size;
        }

        public AList merge(AList other) {
            if (other.size > this.size) {
                return other.merge(this);
            }
            addAll(other);
            return this;
        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = fi();
            }
            return k;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int fi() {
            String t = next();
            int cur = 0;
            boolean n = t.charAt(0) == '-';
            for (int a = n ? 1 : 0; a < t.length(); a++) {
                cur = cur * 10 + t.charAt(a) - '0';
            }
            return n ? -cur : cur;
        }

    }

    static class DSList {
        int[] par;
        AList[] ct;

        public DSList(int n) {
            par = new int[n];
            ct = new AList[n];
            for (int x = 0; x < n; x++) {
                ct[x] = new AList();
                ct[x].add(x);
            }
            Arrays.setAll(par, i -> i);
        }

        public int root(int a) {
            int q = a;
            while (q != par[q]) {
                q = par[q];
            }
            while (a != q) {
                int next = par[a];
                par[a] = q;
                a = next;
            }
            return q;
        }

        public void union(int l1, int l2) {
            int r1 = root(l1);
            int r2 = root(l2);
            if (r1 == r2) return;
            if (ct[r2].size() < ct[r1].size()) {
                int s = r1;
                r1 = r2;
                r2 = s;
            }

            par[r1] = r2;
            ct[r2].addAll(ct[r1]);
        }

        public AList val(int i) {
            return ct[i];
        }

    }
}

