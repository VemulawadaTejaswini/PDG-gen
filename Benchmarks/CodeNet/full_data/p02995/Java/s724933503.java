import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final int MAX = 100100;
    InputStream in = System.in;
    PrintStream out = System.out;

    public long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public long lcm(long a, long b) {
        return (a*b) / gcd(a,b);
    }

    public long f(long a, long b, long c) {
        long n =  b / c;
        n -= a / c;
        return n;
    }

    public void _main(String[] args) {
        Scanner sc = new Scanner(in);
        long A = sc.nextLong(), B = sc.nextLong();
        long C = sc.nextLong(), D = sc.nextLong();
        out.println((B-A+1) - f(A,B,C) - f(A,B,D) + f(A,B,lcm(C,D)));
    }

    public static void main(String[] args) {
        new Main()._main(args);
    }
}
