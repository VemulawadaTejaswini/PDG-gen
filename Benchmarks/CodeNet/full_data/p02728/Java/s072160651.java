import java.io.*;
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        Node.N = N;
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 1; i <= N; i++)
            map.put(i, new Node(i));
        for (int i = 1; i < N; i++) {
            Node a = map.get(in.nextInt());
            Node b = map.get(in.nextInt());
            a.nodes.add(b);
            b.nodes.add(a);
        }
        map.get(1).setSize(null);
        map.get(1).dp1(null);
        map.get(1).dp2(null);
        for (int i = 1; i <= N; i++)
            out.println(map.get(i).dp);
        out.flush();
    }

    static final int MOD = 1_000_000_007;
    static long mPow(long a, long b) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1)
                ret = (ret * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return ret;
    }
    static long mInv(long a) {
        return mPow(a, MOD - 2);
    }
    static long mFact(long a) {
        long ret = 1;
        for (long i = 2; i <= a; i++)
            ret = (ret * i) % MOD;
        return ret;
    }
    static Long[] mFacts0 = {1L, 1L};
    static List<Long> mFacts = new ArrayList<>(Arrays.asList(mFacts0));
    static long mFact2(long a) {
        for (int i = mFacts.size(); i <= a; i++)
            mFacts.add((mFacts.get(i - 1) * i) % MOD);
        return mFacts.get((int) a);
    }

    static class Node {
        static long N;
        Set<Node> nodes = new HashSet<>();
        long value, dp, size;
        Node(int i) {
            value = i;
        }
        long setSize(Node parent) {
            size = 1;
            for (Node n : nodes) if (n != parent)
                size += n.setSize(this);
            return size;
        }
        long dp1(Node parent) {
            dp = mFact2((parent == null ? N : size) - 1);
            for (Node n: nodes) if (n != parent) {
                dp = (dp * n.dp1(this)) % MOD;
                dp = (dp * mInv(mFact2(n.size))) % MOD;
            }
            return dp;
        }
        void dp2(Node child) {
            if (child != null) {
                dp = child.dp * size % MOD;
                dp = dp * mInv(N - size) % MOD;
            }
            for (Node n: nodes) if (n != child)
                n.dp2(this);
        }
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}