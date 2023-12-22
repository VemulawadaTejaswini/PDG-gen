import java.io.*;
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        Map<Integer, Node> map = new HashMap<>();
        for (int i = 1; i <= N; i++)
            map.put(i, new Node());
        for (int i = 1; i < N; i++) {
            Node a = map.get(in.nextInt());
            Node b = map.get(in.nextInt());
            a.nodes.add(b);
            b.nodes.add(a);
        }
        for (int i = 1; i <= N; i++)
            out.println(map.get(i).getDP(N));
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
    static long mFrac(long a) {
        long ret = 1;
        for (long i = 2; i <= a; i++)
            ret = (ret * i) % MOD;
        return ret;
    }
    static Long[] mFracs0 = {1L, 1L};
    static List<Long> mFracs = new ArrayList<>(Arrays.asList(mFracs0));
    static long mFrac2(long a) {
        for (int i = mFracs.size(); i <= a; i++)
            mFracs.add((mFracs.get(i - 1) * i) % MOD);
        return mFracs.get((int) a);
    }

    static class Node {
        Set<Node> nodes = new HashSet<>();
        Map<Node, Long> dp = new HashMap<>();
        Map<Node, Long> size = new HashMap<>();
        long getDP(long l) {
            long ret = mFrac2(l - 1);
            for (Node n: nodes) {
                if (!dp.containsKey(n))
                    dp.put(n, n.getDP(this));
                ret = (ret * dp.get(n)) % MOD;
                if (!size.containsKey(n))
                    size.put(n, n.getSize(this));
                ret = (ret * mInv(mFrac2(size.get(n)))) % MOD;
            }
            return ret;
        }
        long getDP(Node parent) {
            long ret = mFrac2(getSize(parent) - 1);
            for (Node n: nodes) if (n != parent) {
                if (!dp.containsKey(n))
                    dp.put(n, n.getDP(this));
                ret = (ret * dp.get(n)) % MOD;
                if (!size.containsKey(n))
                    size.put(n, n.getSize(this));
                ret = (ret * mInv(mFrac2(size.get(n)))) % MOD;
            }
            return ret;
        }
        long getSize(Node parent) {
            long ret = 1;
            for (Node n: nodes) if (n != parent) {
                if (!size.containsKey(n))
                    size.put(n, n.getSize(this));
                ret += size.get(n);
            }
            return ret;
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