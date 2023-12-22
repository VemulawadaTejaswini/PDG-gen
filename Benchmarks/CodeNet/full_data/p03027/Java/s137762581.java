import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            BigInteger p = BigInteger.ONE;
            for (int j = 0; j < n; j++) {
                p = p.multiply(BigInteger.valueOf(x + j * d));
            }
            System.out.println(p.remainder(BigInteger.valueOf(1000003)));
        }
    }
}
