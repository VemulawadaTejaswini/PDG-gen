
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final long[] array = new long[n + 1];
        for (int i = 0; i < n; i++) {
            array[scanner.nextInt()]++;
        }

        if (array[0] != 1) {
            System.out.println(0);
            return;
        }

        int last = n;
        for (; last >= 0; last--) {
            if (array[last] != 0) {
                break;
            }
        }

        for (int i = 0; i < last; i++) {
            if (array[i] == 0) {
                System.out.println(0);
                return;
            }
        }

        long answer = 1;
        long pre = 1;
        for (int i = 1; i <= last; i++) {
            answer *= (long) Math.pow(pre, array[i]);
            pre = array[i];
        }

        System.out.println(answer);
    }
}
