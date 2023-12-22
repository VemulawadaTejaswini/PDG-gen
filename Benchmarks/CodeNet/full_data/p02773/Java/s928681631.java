import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Result counterResult = count(num, scanner::next);
        counterResult.counter.entrySet().stream()
                .filter(e -> e.getValue() != null)
                .filter(e -> e.getValue() == counterResult.maxCount)
                .map(Map.Entry::getKey)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    static Result count(int num, Supplier<String> resultSupplier) {
        HashMap<String, Integer> counter = new HashMap<>();
        int maxCount = 0;
        for (int i = 0; i < num; i++) {
            String result = resultSupplier.get();
            int value = counter.getOrDefault(result, 0);
            counter.put(result, ++value);
            if (maxCount < value) {
                maxCount = value;
            }
        }
        return new Result(maxCount, counter);
    }

    static class Result {
        int maxCount;
        Map<String, Integer> counter;

        public Result(int maxCount, Map<String, Integer> counter) {
            this.maxCount = maxCount;
            this.counter = counter;
        }
    }
}