import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");
        long L = Long.parseLong(values[0]);
        long R = Long.parseLong(values[1]);

        long min = 2019;

        for (long i = L; i <= (L + R) / 2; i++) {

            for (long j = i; j <= R; j++) {
                if (i == j) {
                    continue;
                }

                long target = i * j;

                long mod = target % 2019;

                if (min > mod) {
                    min = mod;
                }

                if (min == 0) {
                    break;
                }

            }

        }

        System.out.println(min);

        scanner.close();

    }

}
