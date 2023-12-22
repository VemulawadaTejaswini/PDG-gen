import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt(); // blueNum

        int blueNum = k;
        int redNum = n - blueNum;

        m_facs = new int[n + 1];
        m_facs[0] = 1;
        for (int i = 1; i <= n; ++i) {
            m_facs[i] = mul(m_facs[i - 1], i);
        }


        for (int i = 1; i <= k; i++) {
            System.out.println(calc(i, blueNum, redNum));
        }

    }

    private static final BigInteger CC = BigInteger.valueOf(1000000007);

    private static long calc(int i, int blueNum, int redNum) {
        long blueTori = kumi(blueNum, i);

        long redBothTori = kumi(redNum, i + 1);
        long redSideTori = kumi(redNum, i);
        long redNorTori = kumi(redNum, i - 1);

        BigInteger blueToriBi = BigInteger.valueOf(Math.max(1, blueTori));


        BigInteger redBothToriBi = blueToriBi.multiply(BigInteger.valueOf(Math.max(0, redBothTori)));
        BigInteger redSideToriBi = blueToriBi.multiply(BigInteger.valueOf(Math.max(0, redSideTori)));
        BigInteger redNorToriBi = blueToriBi.multiply(BigInteger.valueOf(Math.max(0, redNorTori)));

        BigInteger result = redBothToriBi.add(redSideToriBi).add(redSideToriBi).add(redNorToriBi);

        return result.mod(CC).longValue();
    }

    private static long kumi(int num, int groupNum) {
        if (groupNum == 0) return 0;
        if (num == groupNum) return 1;
        if (num < groupNum) return 0;
        return ncr(num - 1, groupNum - 1);
    }

    private static final int M = 1000000007;
    private static int[] m_facs;

    private static int mul(int a, int b) {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(CC).intValue();
    }

    private static int fac(int n) {
        return m_facs[n];
    }

    private static int pow(int a, int m) {
        switch (m) {
            case 0:
                return 1;
            case 1:
                return a;
            default:
                int p1 = pow(a, m / 2);
                int p2 = mul(p1, p1);
                return ((m % 2) == 0) ? p2 : mul(p2, a);
        }
    }

    private static int div(int a, int b) {
        return mul(a, pow(b, M - 2));
    }

    private static int ncr(int n, int r) {
        if (n < r) {
            return 0;
        }
        if (n == r) {
            return 1;
        }
        int res = fac(n);
        res = div(res, fac(r));
        res = div(res, fac(n - r));
        return res;
    }
}
