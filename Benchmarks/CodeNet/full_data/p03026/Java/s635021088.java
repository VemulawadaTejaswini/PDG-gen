import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 2; i < 2 * n; i++) {
            count.compute(scanner.nextInt() - 1, (key, value) -> value == null ? 1 : value + 1);
        }
        int[] c = new int[n];
        Arrays.setAll(c, i -> scanner.nextInt());
        Arrays.sort(c);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(count.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[list.get(i).getKey()] = c[i];
        }

        System.out.println(Arrays.stream(c).sum() - c[n - 1]);

        for (int i : a) {
            System.out.println(i);
        }
    }
}