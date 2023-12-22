import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long[][] comb = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    comb[i][j] = 1;
                } else {
                    comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
                }
            }
        }
        TreeMap<Long, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            long x = - sc.nextLong();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        int count = 0;
        long total = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (count + value >= a) {
                if (total == 0) {
                    long sum = 0;
                    for (int i = 1; i <= value && count + i <= b; i++) {
                        sum += comb[value][i];
                    }
                    System.out.println(- entry.getKey());
                    System.out.println(sum);
                    return;
                }
                System.out.println((total + - entry.getKey() * (a - count)) / (double)a);
                System.out.println(comb[value][a - count]);
                return;
            }
            count += value;
            total -= value * entry.getKey();
        }
    }
}