import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.compute(scanner.nextInt(), (key, value) -> value == null ? 1 : value + 1);
        }
        System.out.println(f(map) ? "Yes" : "No");
    }

    static boolean f(Map<Integer, Integer> map) {
        int s = map.size();
        int[][] a = new int[s][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            a[i][0] = entry.getKey();
            a[i++][1] = entry.getValue();
        }

        if (s > 3) {
            return false;
        }

        Arrays.sort(a, Comparator.comparingInt(array -> array[0]));

        if (s == 1) {
            return a[0][0] == 0;
        } else if (s == 2) {
            return a[0][0] == 0 && a[0][1] * 2 == a[1][1];
        } else {
            return a[0][1] == a[1][1] && a[1][1] == a[2][1] && (a[0][0] ^ a[1][0] ^ a[2][0]) == 0;
        }
    }
}