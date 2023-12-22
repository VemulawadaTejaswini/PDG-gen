import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        BigInteger[] a = new BigInteger[N];
        BigInteger all = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            long x = scan.nextLong() * 1000000;
            a[i] = new BigInteger(Long.toString(x));
            all = all.multiply(a[i]);
        }
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
            sum = sum.add(all.divide(a[i]));
        }
        double answer = all.divide(sum).doubleValue() / 1000000;
        System.out.println(String.format("%.6f", answer));
    }
}
