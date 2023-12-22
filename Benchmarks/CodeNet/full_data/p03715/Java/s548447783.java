import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            final List<Long> HW = Arrays.stream(args.get(0).split(" ")).map(Long::valueOf).collect(toList());
            final Long H = Math.min(HW.get(0), HW.get(1));
            final Long W = Math.max(HW.get(0), HW.get(1));

            if (H % 3 == 0 || W % 3 == 0) {
                System.out.println(0);
                return;
            }

            Long min = Long.MAX_VALUE;
            for (Integer x = 1; x < W; x++) {
                final Long first = H * x;
                final Long remainingW = (W - x);
                if (remainingW % 2 == 0 || H % 2 == 0) {
                    final Long ans = Math.abs(first - remainingW * H / 2);
                    min = Math.min(min, ans);
                } else {
                    if (remainingW > H) {
                        final Long second = H * (remainingW / 2 + 1);
                        final Long third = H * (remainingW / 2) ;
                        final Long ans = Math.max(Math.abs(first - second), Math.max(Math.abs(first - third), Math.abs(second - third)));
                        min = Math.min(min, ans);
                    } else  {
                        final Long second = (H / 2 + 1) * remainingW;
                        final Long third = (H / 2) * remainingW;
                        final Long ans = Math.max(Math.abs(first - second), Math.max(Math.abs(first - third), Math.abs(second - third)));
                        min = Math.min(min, ans);
                    }
                }
            }
            System.out.println(min);
        };
    }

}
