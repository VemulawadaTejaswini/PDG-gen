
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public Main(final List<Interval> intervals) {this.intervals = intervals;}

    static class Interval {
        final long l;
        final long r;

        Interval(final long l, final long r) {
            this.l = l;
            this.r = r;
        }
    }

    final List<Interval> intervals;

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();

        final List<Interval> intervals = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            final long l = scanner.nextLong();
            final long r = scanner.nextLong();

            intervals.add(new Interval(l, r));
        }

        final long calc = new Main(intervals).calc();
        System.out.println(calc);
    }

    private long calc() {
        final int currentPos = 0;

        final ArrayList<Interval> intervals = new ArrayList<>(this.intervals);
        intervals.add(new Interval(0, 0));

        long current = currentPos;
        long totalDist = 0;
        while (!intervals.isEmpty()) {
            final long current_ = current;
            final Map<String, Long> collect = intervals.stream().map(interval -> {
                if (interval.r < current_) {
                    return "L";
                } else if (interval.l > current_) {
                    return "R";
                } else {
                    return "0";
                }
            }).collect(groupingBy(identity(), counting()));

            final boolean moveLeft = (collect.getOrDefault("L", 0L)
                                      > collect.getOrDefault("R", 0L));

            Interval best = intervals.get(0);
            for (final Interval i : intervals) {
                if (moveLeft && i.r < current) {
                    best = i;
                    break;
                } else if (i.l > current) {
                    best = i;
                }
            }

            if (best.r < current) {
                totalDist += current - best.r;
                current = best.r;
            } else if (best.l > current) {
                totalDist += best.l - current;
                current = best.l;
            } else {
                totalDist += 0;
                current = current;
            }
            intervals.remove(best);
        }

        return totalDist;
    }
}
