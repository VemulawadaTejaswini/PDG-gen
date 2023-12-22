import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, m;
        List<long[]> scores = new ArrayList<>();
        try (Scanner cin = new Scanner(System.in)) {
            n = cin.nextInt();
            m = cin.nextInt();
            for (int i = 0; i < n; i++) {
                scores.add(new long[] {
                        cin.nextLong(), cin.nextLong(), cin.nextLong() });
            }
        }

        long score = scan(new long[] {0L, 0L, 0L}, scores, m);
        System.out.println(score);
    }

    static long scan(long[] scores, List<long[]> cakes, int m) {
        if (m <= 0) {
            return calcScore(scores);
        } else if (cakes.size() < m) {
            return 0L;
        } else {
            long[] cake = cakes.get(0);
            long[] newScore = new long[] {
                    scores[0] + cake[0], scores[1] + cake[1], scores[2] + cake[2]
            };
            List<long[]> remaining = cakes.subList(1, cakes.size());
            return Math.max(
                    scan(newScore, remaining, m - 1),
                    scan(scores, remaining, m));
        }
    }

    static long calcScore(long[] scores) {
        return Arrays.stream(scores).map(Math::abs).sum();
    }

}