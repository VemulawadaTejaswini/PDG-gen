import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;

    public BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO)) return a;
        return gcd(b,a.remainder(b));
    }

    public BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a,b));
    }

    public BigInteger f(BigInteger a, BigInteger b, BigInteger c) {
        BigInteger n =  b.divide(c).subtract(a.subtract(BigInteger.ONE).divide(c));
        return n;
    }

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        BigInteger A = sc.nextBigInteger(), B = sc.nextBigInteger();
        BigInteger C = sc.nextBigInteger(), D = sc.nextBigInteger();
        out.println((B.subtract(A).add(BigInteger.ONE)).subtract(f(A,B,C)).subtract(f(A,B,D)).add(f(A,B,lcm(C,D))));
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
