
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            long current = scanner.nextLong();
            a[i] = current;
        }

        int dup = 0;
        List<Long> numbers = new ArrayList<>();
        for (long num : a) {
            int value = Collections.binarySearch(
                    numbers, num
            );
            if (value >= 0 && value < numbers.size()) {
                numbers.add(value, num);
                continue;
            }
            if (value == 0) {
                numbers.add(0, num);
                continue;
            }

            int pos = -1 * (value + 1);
            if (pos - 1 >= 0 && numbers.get(pos - 1) < num) {
                numbers.set(pos - 1, num);
            } else {
                numbers.add(pos, num);
            }

        }
        System.out.println(numbers.size() + dup);

    }
}
