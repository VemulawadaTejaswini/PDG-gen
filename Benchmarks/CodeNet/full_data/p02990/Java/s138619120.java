import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf(1000000007);

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BigInteger[] a = new BigInteger[k + 1];

        for (int i = 1; i <= k; i++) {
            if (n - k - i + 1 < 0) {
                System.out.println(0);
                continue;
            }
            a[i] = nCr(n - k + 1, i).multiply(nCr(k - 1, i - 1)).mod(MOD);
            System.out.println(a[i]);
        }
    }

    private static BigInteger nCr(int a, int b) {
        BigInteger ret = BigInteger.ONE;
        for (int i=a; i > a-b; i--) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        for (int i=1; i <= b; i++) {
            ret = ret.divide(BigInteger.valueOf(i));
        }
        return ret;
    }

//    public static BigInteger nCr(int n, int r) {
//        BigInteger num = BigInteger.ONE;
//        for (int i = 1; i <= r; i++) {
//            num = num.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i)).mod(MOD);
//        }
//        return num;
//    }
}