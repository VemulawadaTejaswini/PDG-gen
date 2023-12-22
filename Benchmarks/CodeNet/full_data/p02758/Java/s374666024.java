/**
 * @author derrick20
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int N = sc.nextInt();
        Segment[] segs = new Segment[N + 1];
        int max = Integer.MAX_VALUE;
        segs[0] = new Segment(max, max);
        for (int i = 1; i <= N; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            segs[i] = new Segment(l, l + d);
        }

        Arrays.sort(segs);
        TreeMap<Integer, Integer> leftToIdx = new TreeMap<>();
        for (int i = 0; i <= N; i++) {
//             all unique!
            leftToIdx.put(segs[i].l, i);
        }
        SegmentTree st = new SegmentTree(new int[N + 1]);
        long[] suffix = new long[N + 1];
        suffix[N] = 1;
        // st stores the farthest right idx something at a given
        // spot can reach
//        System.out.println(Arrays.toString(segs));

        for (int i = N - 1; i >= 0; i--) {
            Segment seg = segs[i];
            int j = leftToIdx.ceilingEntry(seg.r).getValue();
            st.update(i, j);
            int farthest = (int) st.queryRange(i, j - 1);
            st.update(i, farthest);
            suffix[i] = (suffix[i + 1] + suffix[farthest]) % mod;
            /*
            // of course, if we are the rightmost thing, then all we
            // can reach is our own idx
            st.update(i, i);
            int farthestIdx = (int) st.queryRange(i, leftToIdx.lowerEntry(seg.r).getValue());
            st.update(i, farthestIdx);
            long aboveWays = suffix[farthestIdx + 1];
            suffix[i] = (suffix[i + 1] + aboveWays) % mod;

             */

        }
//        System.out.println(Arrays.toString(suffix));
        out.println(suffix[0]);
        out.close();
    }

    static long mod = 998244353;

    static class Segment implements Comparable<Segment> {
        int l, r;
        public Segment(int ll, int rr) {
            l = ll; r = rr;
        }
        public String toString() {
            return "[" + l + ", " + r + ")";
        }
        public int compareTo(Segment s2) {
            return l < s2.l ? -1 : 1;
        }
    }


    static class SegmentTree {
        int[] arr;
        long[] tree;
        int[] lo, hi;
        int N;
        // a value that doesn't affect an output (for min it's infinity)
        long NEUTRAL = 0;
        private long merge(long leftVal, long rightVal) {
            return Math.max(leftVal, rightVal);
        }

        public SegmentTree(int[] arr) {
            this.arr = arr;
            N = arr.length;
            tree = new long[4 * N + 1];
            lo = new int[4 * N + 1];
            hi = new int[4 * N + 1];
            // The original bounds of responsibility the root will be [0, N-1]
            constructSegmentTree(1, 0, N - 1);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(queryRange(i, i) + " ");
            }
            return sb.toString();
        }

        // Construct a node which is responsible for the range specified: left to right inclusive!
        private void constructSegmentTree(int node, int left, int right) {
            if (left == right) {
                lo[node] = left;
                hi[node] = right;
                tree[node] = arr[left];
            } else {
                lo[node] = left;
                hi[node] = right;
                int mid = (left + right) / 2;
                constructSegmentTree(leftChild(node), left, mid);
                constructSegmentTree(rightChild(node), mid + 1, right);
                tree[node] = merge(tree[leftChild(node)], tree[rightChild(node)]);
            }
        }

        public long queryRange(int leftBound, int rightBound) {
            return queryRangeHelper(1, leftBound, rightBound);
        }

        // Query from a fixed range left, right
        private long queryRangeHelper(int node, int leftBound, int rightBound) {
            if (hi[node] < leftBound || rightBound < lo[node]) {
                // We are either too far left or too far right
                return NEUTRAL;
            } else if (leftBound <= lo[node] && hi[node] <= rightBound) {
                // Perfectly contained!
                return tree[node];
            } else {
                // Partial covering
                long leftVal = queryRangeHelper(leftChild(node), leftBound, rightBound);
                long rightVal = queryRangeHelper(rightChild(node), leftBound, rightBound);
                long ans = merge(leftVal, rightVal);
                return ans;
            }
        }

        public void update(int index, int val) {
            updateHelper(1, index, val);
        }

        private void updateHelper(int node, int index, int val) {
            if (hi[node] < index || index < lo[node]) {
                // We are either too far left or too far right
                return;
            } else if (index == lo[node] && hi[node] == index) {
                // Found it!
                tree[node] = val;
            } else {
                // Not there yet!
                updateHelper(leftChild(node), index, val);
                updateHelper(rightChild(node), index, val);
                // Make sure to fix our values on the way back up!
                tree[node] = merge(tree[leftChild(node)], tree[rightChild(node)]);
            }
        }

        private int leftChild(int node) {
            return 2 * node;
        }

        private int rightChild(int node) {
            return 2 * node + 1;
        }
    }

    static class FastScanner {
        private int BS = 1<<16;
        private char NC = (char)0;
        private byte[] buf = new byte[BS];
        private int bId = 0, size = 0;
        private char c = NC;
        private double cnt = 1;
        private BufferedInputStream in;

        public FastScanner() {
            in = new BufferedInputStream(System.in, BS);
        }

        public FastScanner(String s) {
            try {
                in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
            }
            catch (Exception e) {
                in = new BufferedInputStream(System.in, BS);
            }
        }

        private char getChar(){
            while(bId==size) {
                try {
                    size = in.read(buf);
                }catch(Exception e) {
                    return NC;
                }
                if(size==-1)return NC;
                bId=0;
            }
            return (char)buf[bId++];
        }

        public int nextInt() {
            return (int)nextLong();
        }

        public int[] nextInts(int N) {
            int[] res = new int[N];
            for (int i = 0; i < N; i++) {
                res[i] = (int) nextLong();
            }
            return res;
        }

        public long[] nextLongs(int N) {
            long[] res = new long[N];
            for (int i = 0; i < N; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long nextLong() {
            cnt=1;
            boolean neg = false;
            if(c==NC)c=getChar();
            for(;(c<'0' || c>'9'); c = getChar()) {
                if(c=='-')neg=true;
            }
            long res = 0;
            for(; c>='0' && c <='9'; c=getChar()) {
                res = (res<<3)+(res<<1)+c-'0';
                cnt*=10;
            }
            return neg?-res:res;
        }

        public double nextDouble() {
            double cur = nextLong();
            return c!='.' ? cur:cur+nextLong()/cnt;
        }

        public String next() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c>32) {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public String nextLine() {
            StringBuilder res = new StringBuilder();
            while(c<=32)c=getChar();
            while(c!='\n') {
                res.append(c);
                c=getChar();
            }
            return res.toString();
        }

        public boolean hasNext() {
            if(c>32)return true;
            while(true) {
                c=getChar();
                if(c==NC)return false;
                else if(c>32)return true;
            }
        }
    }
}
