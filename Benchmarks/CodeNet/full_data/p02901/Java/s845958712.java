import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main
{
    static int n;
    static int m;
    static int[] keyPrices;
    static List<List<Integer>> keys;

    private static int check(int i, boolean[] treasures, int sum) {
        if (i >= m) {
            return Integer.MAX_VALUE;
        }

        // Buy
        int sumInCaseBuy;
        {
            int newSum = sum + keyPrices[i];
            boolean[] newTreasures = Arrays.copyOf(treasures, n);
            List<Integer> key = keys.get(i);
            boolean complete = true;
            for (int ii = 0; ii < n; ii++) {
                if (key.contains(ii)) {
                    newTreasures[ii] = true;
                }
                if (!newTreasures[ii]) {
                    complete = false;
                }
            }

            if (complete) {
                sumInCaseBuy = newSum;
            }
            else {
                sumInCaseBuy = check(i + 1, newTreasures, newSum);
            }
        }

        // Stay
        int sumInCaseStay = check(i + 1, treasures, sum);

        return Math.min(sumInCaseBuy, sumInCaseStay);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        keyPrices = new int[m];
        keys = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            keyPrices[i] = scanner.nextInt();
            int b = scanner.nextInt();
            List<Integer> ks = new ArrayList<>(b);
            for (int j = 0; j < b; j++) {
                ks.add(scanner.nextInt() - 1);
            }
            keys.add(ks);
        }

        boolean[] treasures = new boolean[n];
        for (int i = 0; i < n; i++) {
            treasures[i] = false;
        }

        int result = check(0, treasures, 0);
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}

