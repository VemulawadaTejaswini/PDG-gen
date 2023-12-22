import java.util.*;
import java.math.BigInteger;

public class ABC147D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextLong();
        int[] digit = new int[60];
        for (long a: A) {
            char[] binary = Long.toBinaryString(a).toCharArray();
            for (int i = 0; i < binary.length; i++) {
                digit[i] += (long) (binary[binary.length-1-i] - '0');
            }
        }
        BigInteger ans = BigInteger.ZERO;
        BigInteger mod = new BigInteger((int)(1e9+7) + "");
        BigInteger pow = BigInteger.ONE;
        BigInteger n = new BigInteger(N+"");
        for (int i = 0; i < 60; i++) {
            BigInteger d = new BigInteger(digit[i] + "");
            ans = ans.add(d.multiply(n.subtract(d)).multiply(pow));
            ans = ans.mod(mod);
            pow = pow.multiply(new BigInteger("2"));
            pow = pow.mod(mod);
        }
        System.out.println(ans);
    }
}
