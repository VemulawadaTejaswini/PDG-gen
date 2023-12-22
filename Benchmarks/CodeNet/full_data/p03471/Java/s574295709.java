import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long Y = sc.nextLong();
        sc.close();

        long num_10000 = -1;
        long num_5000 = -1;
        long num_1000 = -1;

        long target = Y - 1000 * N;
        long tmp = -1;

        for (int i = 0; i <= N; i++) {
            if ((target - 9000 * i) % 4000 == 0) {
                tmp = (target - 9000 * i) / 4000;
                if ((tmp >= 0) && (N - tmp - i) >= 0) {
                    num_10000 = i;
                    num_5000 = tmp;
                    num_1000 = N - num_10000 - num_5000;
                    break;
                }
            }
        }

        System.out.println(num_10000 + " " + num_5000 + " " + num_1000);
    }
}