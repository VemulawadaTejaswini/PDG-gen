import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String[] S = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = in.next();
            }

            int[] MARCH = new int[5];
            for (int i = 0; i < N; i++) {
                int index = index(S[i].substring(0, 1));
                if (index < 0) {
                    continue;
                }
                MARCH[index]++;
            }

            long sum = 0;
            for (int mask = 0; mask < (1 << 5); mask++) {
                if (Integer.bitCount(mask) != 3) {
                    continue;
                }
                long count = 1;
                for (int i = 0; i < 5; i++) {
                    if ((mask & (1 << i)) == 0) {
                        continue;
                    }
                    count *= MARCH[i];
                }
                sum += count;
            }

            System.out.println(sum);
        }
    }

    private static int index(String s) {
        return "MARCH".indexOf(s);
    }
}
