import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        if (c - a - b <= 0) {
            System.out.println("No");
            return;
        }
        BigInteger x = new BigInteger(Long.toString(a * b));
        BigInteger sqrt = sqrt(x);
        long target = sqrt.multiply(new BigInteger("2")).longValue();
        if (target < c - a - b) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
    public static BigInteger sqrt(BigInteger x) {
        BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
        BigInteger div2 = div;
        for(;;) {
            BigInteger y = div.add(x.divide(div)).shiftRight(1);
            if (y.equals(div) || y.equals(div2))
                return y;
            div2 = div;
            div = y;
        }
    }
}
