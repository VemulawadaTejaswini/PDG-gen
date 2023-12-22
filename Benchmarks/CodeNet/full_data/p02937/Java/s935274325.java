import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().trim();
        String c = sc.nextLine().trim();

        if (c.chars().anyMatch(i -> m.indexOf(i) == -1)) {
            System.out.println(-1);
            return;
        }

        int index = 0;
        for (char ch : c.toCharArray()) {
            int[] ints = allIndex(m, ch);
            OptionalInt first;
            {
                final int var = index % m.length();
                first = Arrays.stream(ints).filter(i -> i > var).findFirst();
            }

            if (first.isPresent()) {
                index = (index / m.length()) + first.getAsInt();
                continue;
            }

            index = (index / m.length()) * (m.length()-1) + ints[0];
        }
        System.out.println(index);
    }

    private static int[] allIndex(String m, int c) {
        return IntStream.iterate(m.indexOf(c), i -> m.indexOf(c, i + 1)).filter(i -> i > -1).limit(m.length()).distinct().toArray();
    }
}