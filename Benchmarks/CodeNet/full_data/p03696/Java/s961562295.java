import java.math.BigDecimal;
import java.util.*;
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

    static Consumer<List<String>> solve() {
        return args -> {
            Deque<Character> deque = new ArrayDeque<>();
            int cnt = 0;
            for (char c: args.get(1).toCharArray()) {
                if (c == '(') {
                    cnt++;
                    deque.addLast('(');
                } else {
                    if (cnt > 0) {
                        cnt--;
                        deque.addLast(')');
                    } else {
                        deque.addFirst('(');
                        deque.addLast(')');
                    }
                }
            }
            while (cnt-- > 0) {
                deque.addLast(')');
            }
            StringBuilder sb = new StringBuilder();
            for (char c: deque) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        };
    }

}