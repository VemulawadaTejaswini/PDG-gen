package ABC114;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> factor = new HashMap<>();
        IntConsumer add = (int i) -> {
            if (factor.containsKey(i)) factor.put(i, factor.get(i) + 1);
            else factor.put(i, 1);
        };
        for (int i = 2; i <= n; i++) {
            int num = i;
            for (int j = 2; j <= 10; j++) {
                while (num % j == 0) {
                    num /= j;
                    add.accept(j);
                }
            }
            if (num != 1) add.accept(num);
        }

        int over4 = 0, over2 = 0, over14 = 0, over4_14 = 0, over24 = 0, over2_24 = 0, over74 = 0;
        for (int value : factor.values()) {
            over4 += incIfInRange(value, 4, Integer.MAX_VALUE);
            over2 += incIfInRange(value, 2, 4);
            over14 += incIfInRange(value, 14, Integer.MAX_VALUE);
            over4_14 += incIfInRange(value, 4, 14);
            over24 += incIfInRange(value, 24, Integer.MAX_VALUE);
            over2_24 += incIfInRange(value, 2, 24);
            over74 += incIfInRange(value, 74, Integer.MAX_VALUE);
        }

        System.out.println(over4 * (over4 - 1) * (over2 + over4 - 2) / 2 + over14 * (over4_14 + over14 - 1) + over24 * (over2_24 + over24 - 1) + over74);
    }

    private static int incIfInRange(int value, int st, int end) {
        if (value >= st && value < end) return 1;
        return 0;
    }
}
