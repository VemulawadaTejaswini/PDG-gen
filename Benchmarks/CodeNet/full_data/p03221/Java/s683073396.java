import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        // index(0-origin), prefecture(1-origin), year, order(1-origin)
        int[][] cities = new int[m][4];
        for (int i = 0; i < m; i++) {
            int prefecture = scanner.nextInt();
            int year = scanner.nextInt();
            cities[i] = new int[]{i, prefecture, year, 0};
        }
        Arrays.sort(cities, (a, b) -> (a[1] == b[1]) ? a[2] - b[2] : a[1] - b[1]);

        cities[0][3] = 1;
        int order = 1;
        for (int i = 1; i < m; i++) {
            if (cities[i - 1][1] != cities[i][1]) {
                cities[i][3] = 1;
                order = 1;
            } else {
                cities[i][3] = ++order;
            }
        }

        Arrays.sort(cities, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", cities[i][1]) + String.format("%06d", cities[i][3]));
        }
    }
}
