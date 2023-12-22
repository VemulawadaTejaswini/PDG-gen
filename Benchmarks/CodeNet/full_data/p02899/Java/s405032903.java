import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int number = Integer.parseInt(sc.nextLine());
            final Map<Integer, Integer> mem = new HashMap<Integer, Integer>();
            final String[] values = sc.nextLine().split(" ");
            for (int i = 0; i < values.length; i++) {
                final int val = Integer.parseInt(values[i]);
                mem.put(val, i + 1);
            }
            final StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= values.length; i++) {
                sb.append(mem.get(i) + " ");
            }
            final String result = sb.toString().trim();
            System.out.println(result);
        }
    }
}
