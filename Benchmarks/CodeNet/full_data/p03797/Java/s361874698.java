import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong(); // s
        long M = sc.nextLong(); // c

        long sccCount = M / 2; // scc max

        if (N < sccCount) {
            System.out.println((M - (2 * N)) / 4 + N);
        } else {
            System.out.println(sccCount);
        }
    }
}