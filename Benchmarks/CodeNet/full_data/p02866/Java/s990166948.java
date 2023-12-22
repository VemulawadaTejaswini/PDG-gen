import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        BigInteger ans = BigInteger.ONE;
        BigInteger first = new BigInteger(sc.next());
        if (!first.equals(BigInteger.ZERO)) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < N; i++) {
            ans = ans.multiply(new BigInteger(sc.next()));
            ans = ans.mod(new BigInteger("998244353"));
        }
        System.out.println(ans.toString());
    }
}
