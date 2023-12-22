import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        long[] as = new long[N];

        for (int i = 0; i < N; i++) {
            long value = sc.nextLong();

            if (N % 2 == 0) {
                int index = (i % 2 == 0) ? N/2 + i/2 : N/2 - (i + 1)/2;
                as[index] = value;
            } else {
                int index = (i % 2 == 0) ? N/2 - i/2 : N/2 + (i + 1)/2;
                as[index] = value;
            }
        }

        System.out.println(Arrays.toString(as).replace("]", "").replace("[", "").replace(",", ""));
    }
}