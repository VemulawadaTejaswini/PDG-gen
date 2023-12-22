
import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] a = IntStream.range(0, h).mapToObj(i -> scanner.next().toCharArray()).toArray(char[][]::new);
        int[][] dist = new int[h][w];
        Arrays.stream(dist).forEach(array -> Arrays.fill(array, 10000));

        for (int i = 0; i < h; i++) {
            for (int j = 0, c = 0; j < w; j++) {
                if (a[i][j] == '#') {
                    dist[i][j] = 0;

                    c = 1;
                } else if (c > 0) {
                    dist[i][j] = c;
                    c++;
                }
            }

            for (int j = w - 1, c = 0; j >= 0; j--) {
                if (a[i][j] == '#') {
                    c = 1;
                } else if (c > 0) {
                    dist[i][j] = Math.min(dist[i][j], c);
                    c++;
                }
            }
        }

        for (int i = 0; i < w; i++) {
            for (int j = 0, c = 10000; j < h; j++) {
                if (c > dist[j][i]) {
                    c = dist[j][i] + 1;
                } else {
                    dist[j][i] = c;
                    c++;
                }
            }

            for (int j = h - 1, c = 10000; j >= 0; j--) {
                if (c > dist[j][i]) {
                    c = dist[j][i] + 1;
                } else {
                    dist[j][i] = c;
                    c++;
                }
            }
        }

        System.out.println(Arrays.stream(dist).mapToInt(array -> Arrays.stream(array).max().getAsInt()).max().getAsInt());
    }
}