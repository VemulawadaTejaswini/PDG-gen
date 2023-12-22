import java.io.*;
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = in.nextInt();
        int a = 0;
        int b = N - 1;
        int ans = 0;
        boolean[] flag = new boolean[N];
        while (a != b) {
            int amax = 0;
            int ai = 0;
            for (int i = N - 1; i >= a; i--) if (!flag[i]) {
                final int i1 = Math.abs(i - a) * A[i];
                if (amax < i1) {
                    amax = i1;
                    ai = i;
                }
            }
            int bmax = 0;
            int bi = 0;
            for (int i = 0; i <= b; i++) if (!flag[i]) {
                final int i1 = Math.abs(i - b) * A[i];
                if (bmax < i1) {
                    bmax = i1;
                    bi = i;
                }
            }
            if (amax > bmax) {
                ans += amax;
                flag[ai] = true;
                a++;
            } else {
                ans += bmax;
                flag[bi] = true;
                b--;
            }
        }
        for (int i = 0; i < N; i++) if (!flag[i]) {
            ans += Math.abs(i - a) * A[i];
        }
        out.println(ans);
        out.flush();
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