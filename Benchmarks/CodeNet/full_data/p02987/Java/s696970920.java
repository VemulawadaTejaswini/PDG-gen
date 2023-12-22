import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final Map<Character, Integer> m = new HashMap<>();
        final String str = scanner.next();
        for (char c: str.toCharArray()) {
            if (!m.containsKey(c)) {
                m.put(c, 0);
            }

            m.put(c, m.get(c) + 1);
        }

        final int size = m.entrySet().stream().filter(e -> e.getValue() == 2).collect(Collectors.toList()).size();

        System.out.println(size == 2 ? "Yes" : "No");
    }
}