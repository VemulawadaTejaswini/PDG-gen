
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final List<Key> keys = new ArrayList<>();
        final int[] locks = new int[n + 1];
        locks[0] = 1;
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            final Key key = new Key();
            key.price = a;
            for (int j = 0; j < b; j++) {
                final int lock = scanner.nextInt();
                key.locks.add(lock);
                locks[lock]++;
            }
            keys.add(key);
        }

        for (final int lock : locks) {
            if(lock == 0){
                System.out.println(-1);
                return;
            }
        }

        keys.sort(Comparator.comparingInt(key -> key.price));

        for (int i = keys.size() - 1; i >= 0; i--) {
            final Key key = keys.get(i);
            boolean flag = false;
            for (final int lock : key.locks) {
                if (locks[lock] == 1) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                for (final int lock : key.locks) {
                    locks[lock]--;
                }
                keys.remove(key);
            }
        }

        System.out.println(getPrice(keys));
    }

    private static int getPrice(final List<Key> keys) {
        return keys.stream()
                .map(key -> key.price)
                .mapToInt(Integer::intValue)
                .sum();
    }

    static class Key {
        int price;
        List<Integer> locks = new ArrayList<>();
    }
}
