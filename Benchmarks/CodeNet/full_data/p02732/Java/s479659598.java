import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] boals = new int[N];

        for (int i = 0; i < boals.length; i++) {
            boals[i] = scanner.nextInt();
        }

        scanner.close();

        // 辞書作成
        Map<Integer, Integer> boalMap = new HashMap<>();
        for (int i : boals) {
            if (boalMap.containsKey(i)) {
                boalMap.put(i, boalMap.get(i) + 1);
            } else {
                boalMap.put(i, 1);
            }
        }

        for (int i : boals) {
            long ans = 0;
            for (Integer key : boalMap.keySet()) {
                if (key == i) {
                    ans += calcu(boalMap.get(key) - 1);
                } else {
                    ans += calcu(boalMap.get(key));
                }
            }

            System.out.println(ans);
        }
    }

    public static int calcu(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return n * (n - 1) / 2;
        }
    }
}
