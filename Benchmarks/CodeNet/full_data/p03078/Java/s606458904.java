
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int aLength = scanner.nextInt();
        final int bLength = scanner.nextInt();
        final int cLength = scanner.nextInt();
        final int choice = scanner.nextInt();

        final Long[] a = new Long[aLength];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextLong();
        }

        final Long[] b = new Long[bLength];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextLong();
        }

        final Long[] c = new Long[cLength];
        for (int i = 0; i < c.length; i++) {
            c[i] = scanner.nextLong();
        }

        final Long[] ab = new Long[aLength * bLength];
        int count = 0;
        for (final long aValue : a) {
            for (final long bValue : b) {
                ab[count++] = aValue + bValue;
            }
        }

        Arrays.sort(ab, Comparator.reverseOrder());

        final Long[] filteredAB = new Long[Math.min(choice, ab.length)];

        System.arraycopy(ab, 0, filteredAB, 0, filteredAB.length);

        final Long[] answers = new Long[filteredAB.length * cLength];
        int countAnswers = 0;
        for (final long abValue : filteredAB) {
            for (final long cValue : c) {
                answers[countAnswers++] = abValue + cValue;
            }
        }

        Arrays.sort(answers, Comparator.reverseOrder());

        for (int i = 0; i < choice; i++) {
            System.out.println(answers[i]);
        }
    }
}
