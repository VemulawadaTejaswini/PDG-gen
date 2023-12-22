
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    // TODO solve
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int d = scanner.nextInt();
        final int a = scanner.nextInt();

        final List<Monster> list = IntStream.range(0, n)
                .mapToObj(i -> new Monster(scanner.nextInt(), scanner.nextInt()))
                .sorted(Comparator.comparingLong(monster -> monster.x))
                .collect(Collectors.toList());

        final List<Integer> indices = list.stream()
                .map(m -> m.x)
                .collect(Collectors.toList());

        long sum = 0;
        long counter = 0;
        final long[] array = new long[n];
        for (int i = 0; i < list.size(); i++) {
            final Monster monster = list.get(i);
            if (sum < monster.hp) {
                final long diff = monster.hp - sum;
                final long tmp = (diff + a - 1) / a;
                counter += tmp;
                sum += tmp * a;

                final int last = monster.x + 2 * d;
                final int found = Collections.binarySearch(indices, last);
                if (found >= 0) {
                    array[found] += tmp * a;
                } else {
                    array[~found - 1] += tmp * a;
                }
            }
            sum -= array[i];
        }
        System.out.println(counter);
    }

    static class Monster {
        final int x;
        final long hp;

        Monster(final int x, final int hp) {
            this.x = x;
            this.hp = hp;
        }
    }
}
