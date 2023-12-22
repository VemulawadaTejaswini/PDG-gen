import java.util.*;

/**
 * AtCoder Beginner Contest 091
 * D - Two Sequences
 */
class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(solve(a, b));
    }

    static int solve(int[] a, int[] b) {
        boolean[] carry = carryBits(a, b);
        boolean[] s     =   sumBits(a, b);
        xorBits(s, carry);
        return bitsToInt(s);
    }

    final static int N_BIT = 28;

    /**
     * carry[k] = (すべてのi, jについての c[i][j][k] のxor) を返す。
     * ただし c[i][j][k] は，a[i] + b[j] を計算したときの第k - 1ビット
     * から第kビットへの桁上り。
     */
    static boolean[] carryBits(int[] a, int[] b) {
        int n = a.length;
        boolean[] carry = new boolean[N_BIT + 1];

        for (int k = 0; k < N_BIT; k++) {
            int bit = 1 << (k + 1);
            int mask = bit - 1;
            // 第0〜kビットだけ取り出して昇順に整列
            sortOnBit(1 << k, a);
            sortOnBit(1 << k, b);
            // 桁上りするi, jの組の個数を数える
            int ncarry = 0;
            int j = 0;
            for (int i = n - 1; i >= 0; i--) {
                while (j < n) {
                    if ((a[i] & mask) + (b[j] & mask) >= bit) {
                        // (a[i]+b[j]) 〜 (a[i]+b[n-1]) は桁上りする
                        ncarry += n - j;
                        break;
                    } else {
                        j += 1;
                    }
                }
            }
            carry[k + 1] = (ncarry % 2 != 0);
        }
        return carry;
    }

    static void sortOnBit(int bit, int[] a) {
        int n = a.length;
        int[] buf = new int[n];
        int zerop = 0;
        int onep  = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] & bit) == 0) {
                a[zerop++] = a[i];
            } else {
                buf[onep++] = a[i];
            }
        }
        for (int i = 0; i < onep; i++) {
            a[zerop++] = buf[i];
        }
    }

    /**
     * s[k] = (すべてのi, jについての (a[i][k] ^ b[i][k]) のxor) を返す。
     */
    static boolean[] sumBits(int[] a, int[] b) {
        int n = a.length;
        boolean[] s = new boolean[N_BIT + 1];

        // nが偶数 -> s = [0, ..., 0]
        if (n % 2 == 0) {
            return s;
        }

        // nが奇数 ->
        // s[k] = a[0][k] ^ ... ^ a[n-1][k] ^ b[0][k] ^ ... ^ b[n-1][k]
        for (int k = 0; k < N_BIT; k++) {
            int bit = 1 << k;
            // 1であるビットの個数
            int na = 0;
            int nb = 0;
            for (int i = 0; i < n; i++) {
                if ((a[i] & bit) != 0) { na++; }
                if ((b[i] & bit) != 0) { nb++; }
            }
            s[k] = ((na + nb) % 2 != 0);
        }
        return s;
    }

    static void xorBits(boolean[] s, boolean[] t) {
        for (int i = 0; i < s.length; i++) {
            s[i] ^= t[i];
        }
    }

    static int bitsToInt(boolean[] s) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]) { sum += 1 << i; }
        }
        return sum;
    }
}
