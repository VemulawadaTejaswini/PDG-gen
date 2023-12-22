import java.util.*;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        arr[n] = x;
        int[] memo = new int[n+1];
        for (int i = 0; i < n; i++) {
            memo[i] = arr[i + 1] - arr[i];
        }

        int gcd = IntStream.of(memo).mapToObj(BigInteger::valueOf) 
                .reduce(BigInteger::gcd) 
                .orElse(BigInteger.ZERO)
                .intValue();

        System.out.println(gcd);

    }
}