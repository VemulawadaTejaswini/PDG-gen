
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final List<Integer> list = new ArrayList<>();
        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            final int a = scanner.nextInt();
            list.add(a);
            set.add(a);
        }

        list.sort(Comparator.naturalOrder());
        int pow = 1 << 30;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            final int value = list.get(i);
            if (!set.contains(value)) {
                continue;
            }
            set.remove(value);

            while (pow >> 1 > value) {
                pow = pow >> 1;
            }

            final int index = Collections.binarySearch(list, pow - value);
            if (index < 0) {
                continue;
            }
            final int sbj = list.get(index);
            if (set.contains(sbj)) {
                count++;
                set.remove(sbj);
            }
        }
        System.out.println(count);
    }
}
