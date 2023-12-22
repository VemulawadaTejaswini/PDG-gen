import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        solve();
    }

    private static void solve() {

        int n = scanner.nextInt();

        Map<Integer, Integer> count = new HashMap<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
            int c = count.getOrDefault(a, 0);
            count.put(a, c + 1);
        }

        long total = 0;

        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            total += e.getValue() * (e.getValue() - 1) / 2;
        }

        for (int a : arr) {
            int c = count.get(a);
            long res = total - c + 1;
            System.out.println(res);
        }
    }
}