import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static BigInteger[] xs = new BigInteger[100000];
    private static BigInteger[] vs = new BigInteger[100000];

    private static BigInteger C;
    private static int N;
    //D - Static Sushi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        C = scanner.nextBigInteger();
        for(int i = 0; i < N; i++) {
            xs[i] = scanner.nextBigInteger();
            vs[i] = scanner.nextBigInteger();
        }

        System.out.println(eat(0, BigInteger.ZERO, BigInteger.ZERO));
    }

    private static BigInteger eat(int i, BigInteger pos, BigInteger k) {
        //System.out.printf("%d %d %d\n", i, pos, k);
        if (i >= N) {
            return k;
        }

        BigInteger dx = pos.add(C).subtract(xs[i]).mod(C).abs().min(xs[i].subtract(pos));
        BigInteger dk = k.add(vs[i]).subtract(dx);
        if (dk.compareTo(BigInteger.ZERO) < 0) {
            //System.out.printf("skip (i=%d, pos=%d, dx=%d, vs=%d)\n", i, pos, dx, vs[i]);
            return eat(i + 1, pos, k);
        }
        else {
            BigInteger l = eat(i + 1, pos, k);
            BigInteger r = eat(i + 1, xs[i], dk);
            //System.out.printf("l=%d r=%d (i=%d, pos=%d)\n", l, r, i, pos);
            return l.max(r);
        }
    }
}
