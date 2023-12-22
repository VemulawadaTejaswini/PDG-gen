import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

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
            Long A = Long.valueOf(args.get(0).split(" ")[0]) - 1L;
            Long B = Long.valueOf(args.get(0).split(" ")[1]);
            Long C = Long.valueOf(args.get(0).split(" ")[2]);
            Long D = Long.valueOf(args.get(0).split(" ")[3]);
            Long ansA = A - ((A / C) + (A / D) - (A / ((C * D) / gcd(C, D))));
            Long ansB = B - ((B / C) + (B / D) - (B / ((C * D) / gcd(C, D))));
            System.out.println(ansB - ansA);
        };
    }

    private static Long gcd(long x, long y) {
        if (x < y) return gcd(y, x);
        if (x % y > 0) return gcd(y, x % y);
        return y;
    }

}
