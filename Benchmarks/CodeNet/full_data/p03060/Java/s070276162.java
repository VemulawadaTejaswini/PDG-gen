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
			final List<Integer> vList = Arrays.stream(args.get(1).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
			final List<Integer> cList = Arrays.stream(args.get(2).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
			int ans = 0;
			for (int i = 0; i < vList.size(); i++) {
				ans += Math.max(0, vList.get(i) - cList.get(i));
			}
			System.out.println(ans);
        };
    }

}
