import java.io.InputStream;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<BigInteger> A = new LinkedList<>();
        for (int i = 0; i < n; i++) A.add(BigInteger.valueOf(input .nextInt()));
        input .close();

        BigInteger lcm = A.stream().parallel()
                .reduce(BigInteger.ONE, (a, b) -> a.divide(a.gcd(b)).multiply(b));

        BigInteger ans = A.stream().parallel()
                .map(lcm::divide)
                .reduce(BigInteger::add)
                .get();

        BigInteger mod = BigInteger.valueOf(1000000007);
        System.out.println(ans.mod(mod));
    }


}
