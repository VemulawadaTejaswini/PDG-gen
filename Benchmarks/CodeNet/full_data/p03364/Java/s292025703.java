
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            final String s = scanner.next();
            for (int j = 0; j < n; j++) {
                table[i][j] = s.charAt(j) - 'a';
            }
        }

        final List<Integer> list = countGood(table, n);
        final Set<Integer> container = new HashSet<>(list);
        if (!container.contains(0)) {
            list.add(0);
        }

        long counter = 0;
        for (final int a : list) {
            for (final int b : list) {
                if (container.contains((a + b) % n)) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }

    private static List<Integer> countGood(final int[][] table, final int length) {
        final List<Integer> list = new ArrayList<>();
        for (int c = 0; c < length; c++) {
            boolean flag = true;
            for (int i = 0; i < length && flag; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (table[i][j] != table[j][i]) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                list.add(c);
            }

            final int[] copy = new int[length];
            System.arraycopy(table[0], 0, copy, 0, length);
            for (int i = 1; i < length; i++) {
                System.arraycopy(table[i], 0, table[i - 1], 0, length);
            }
            System.arraycopy(copy, 0, table[length - 1], 0, length);
        }
        return list;
    }
}
