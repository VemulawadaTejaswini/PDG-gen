import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
            List<Integer> numList = Arrays.stream(args.get(1).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            int min = Integer.MAX_VALUE;
            int right = numList.stream().mapToInt(x -> x).sum();
            int left = 0;
            for (int i = 0; i < numList.size(); i++) {
                left += numList.get(i);
                right -= numList.get(i);
                min = Math.min(min, Math.abs(right - left));
            }
            System.out.println(min);
        };
    }

}
