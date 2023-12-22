
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> colors = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            final int next = scanner.nextInt();
            insert(colors, next);
        }

        System.out.println(colors.size());
    }

    private static void insert(final List<Integer> list, final int value) {

        int idx = Collections.binarySearch(list, value);

        if (idx < 0) {
            idx = -idx - 1;
            if (idx == 0) {
                list.add(0, value);
            } else {
                list.set(idx - 1, value);
            }
            return;
        }

        if (idx == 0) {
            list.add(0, value);
        } else {
            list.add(idx, value);
        }
    }
}
