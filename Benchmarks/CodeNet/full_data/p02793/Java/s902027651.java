import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    BigInteger ZERO = new BigInteger("0");

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];

        BigInteger LCM = new BigInteger("1");
        for (int i = 0; i < N; i++) {
            String in = scanner.next();
            BigInteger temp = new BigInteger(in);
            LCM = LCM.multiply(temp).divide(GCD(LCM, temp));
            A[i] = Long.parseLong(in);
        }

        long modLCM = LCM.mod(new BigInteger("1000000007")).longValue();

        long Ans = 0;
        for (int i = 0; i < N; i++) {
            Ans = ( Ans + modLCM * modInv(A[i]) % 1000000007L ) % 1000000007L;
        }

        System.out.println(Ans);
    }

    long modInv(long a){
        long b = 1000000007L, u = 1, v = 0;
        while(b > 0){
            long t = a / b;
            a -= t * b;
            u -= t * v;

            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            u = u ^ v;
            v = u ^ v;
            u = u ^ v;
        }
        u %= 1000000007L;
        if (u < 0) u += 1000000007L;

        return u;
    }

    BigInteger GCD(BigInteger a, BigInteger b){
        if (b.equals(ZERO))
            return a;
        else
            return GCD(b, a.mod(b));
    }

    public static void main(String[] args){
        new Main();
    }
}
