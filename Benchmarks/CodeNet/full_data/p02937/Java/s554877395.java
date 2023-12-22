import java.util.Arrays;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.stream.LongStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        long index = 0;
        for (char ch : c.toCharArray()) {
            final long prev = index;
            OptionalLong first = allIndex(m, ch).filter(i -> i > prev).findFirst();
            if (!first.isPresent()) {
                System.out.println(-1);
                return;
            }
            index = first.getAsLong();
        }
        System.out.println(index + 1);
    }

    private static LongStream allIndex(String m, int c) {
        String m2 = m + m;

        int i = m.indexOf(c);
        if (i == -1) return LongStream.empty();

        int[] ints = new int[m.length()];
        for (int prev = 0; i > -1; prev = i, i = m2.indexOf(c, i + 1)) {
            Arrays.fill(ints, prev, Math.min(i, m.length()), i);
            if (i > m.length()) break;
        }

        return repeat(ints);
    }

    private static LongStream repeat(int... ints) {
        return LongStream.iterate(0, i -> i - (i % ints.length) + ints[(int) i % ints.length]);
    }
}