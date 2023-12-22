
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        final List<Integer> divide = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            divide.add((int) Math.pow(9, i + 1));
        }

        for (int i = 0; i < 5; i++) {
            divide.add((int) Math.pow(6, i + 1));
        }

        divide.add(1);
        divide.sort(Comparator.naturalOrder());

        final int[][] dpTable = new int[divide.size()][n];
        for (int i = 0; i < n; i++) {
            dpTable[0][i] = i + 1;
        }

        for (int i = 1; i < dpTable.length; i++) {
            final int d = divide.get(i);
            for (int j = 0; j < n; j++) {
                if (j < d) {
                    dpTable[i][j] = dpTable[i - 1][j];
                    continue;
                }

                dpTable[i][j] = Math.min(dpTable[i - 1][j], dpTable[i][j - d] + 1);
            }
        }

        System.out.println(dpTable[divide.size() - 1][n - 1]);
    }
}
