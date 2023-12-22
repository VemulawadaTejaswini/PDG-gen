import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by hirai on 2016/08/30.
 */
public class Main {

    private static long ans = 0;
    private static int expect_avg;
    private static int array_size;
    private static int[] array;

    public static final void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        expect_avg = scanner.nextInt();

        array = new int[array_size];
        for(int i=0;i<array_size;i++){
            array[i] = scanner.nextInt();
        }

        calc(0, 0, 0);

        System.out.println(ans);
    }

    private static void calc(int start, long sum, int cnt) {
        for (int i = start; i < array_size; i++) {
            final int tmp = array[i];
            final long avg = (sum + tmp) / (cnt + 1);
            final long remainder = (sum + tmp) % (cnt + 1);
            if (avg == expect_avg && remainder == 0) {
                ans++;
            }
            calc(i + 1, sum + tmp, cnt + 1);
        }
    }
}