import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < n; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int length = calcLength(i, j, x, y);
                map.put(length, map.get(length) + 1);
            }
        }

        for (int i = 1; i < n; i++) {
            System.out.println(map.get(i));
        }
    }

    private static int calcLength(int i, int j, int x, int y) {
        if (i <= x && j >= y) {
            return ((j - i) - (y - x)) + 1;
        } else if (i <= x && j < y) {
            int lengthl = j - i;
            int lengthr = (y - j) + (x - i) + 1;
            return Math.min(lengthl, lengthr);
        } else if (i > x && j >= y) {
            int lengthl = j - i;
            int lengthr = (i - x) + (j - y) + 1;
            return Math.min(lengthl, lengthr);
        } else {
            return j - i;
        }
    }
}
