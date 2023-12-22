
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final String[] array = scanner.next().split("");

        final HashSet[] twoDigitsArray = new HashSet[n];
        final int[] countArray = new int[100];

        for (int i = 0; i < array.length - 1; i++) {
            final HashSet tmp = new HashSet();
            for (int j = i + 1; j < array.length; j++) {
                tmp.add(array[i] + array[j]);
            }
            twoDigitsArray[i] = tmp;

            for (Object o : tmp) {
                final int index = Integer.parseInt((String) o);
                countArray[index]++;
            }
        }

        final Set<String> answerSet = new HashSet<>();
        for (int i = 0; i < array.length - 2; i++) {
            final HashSet set = twoDigitsArray[i];
            for (final Object o : set) {
                final int index = Integer.parseInt((String) o);
                countArray[index]--;
            }

            for (int j = 0; j < countArray.length; j++) {
                if (countArray[j] == 0) {
                    continue;
                }
                answerSet.add(array[i] + String.format("%02d", j));
            }
        }

        System.out.println(answerSet.size());
    }
}
