import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.IntStream;

class Main {
    private static TreeMap<Long, Long> map = new TreeMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String... args) {
        int n = scanner.nextInt(), m = scanner.nextInt();
        IntStream.range(0, n).forEach(i -> setMap(1, scanner.nextLong()));
        IntStream.range(0, m)
            .forEach(i -> setMap(scanner.nextInt(), scanner.nextLong()));
        long total = 0, num = 0;
        while ((n -= num) > 0) {
            long lastKey = map.lastKey();
            num = Math.min(map.get(lastKey), n);
            total += num * lastKey;
            map.remove(lastKey);
        }
        System.out.println(total);
    }
    private static void setMap(int num, long value) {
        map.put(value, Optional.ofNullable(map.get(value)).orElse(0l) + num);
    }
}