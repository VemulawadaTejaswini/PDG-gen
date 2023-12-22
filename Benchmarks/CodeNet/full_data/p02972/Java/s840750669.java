
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextInt();
        }
        int[] box = new int[n + 1];
        Map<Integer, List<Integer>> number = new HashMap<>();
        for (int i = 1; i <= n; ++i) {
            number.put(i, new ArrayList<>());
        }
        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k * i <= n; ++k) {
                number.get(k * i).add(i);
            }
        }
        for (int i = n; i >= 1; --i) {
            box[i] = a[i] % 2;
            for (int k : number.get(i)) {
                a[k] = a[k] % 2 - box[i] % 2 == 0
                        ? a[k]
                        : 1 - a[k];
            }
        }

        int count = 0;
        for (int i = 1; i <= n; ++i) {
            if (box[i] == 1) {
                ++count;
            }
        }
        System.out.println(count);
        for (int i = 1; i <= n; ++i) {
            if (box[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}