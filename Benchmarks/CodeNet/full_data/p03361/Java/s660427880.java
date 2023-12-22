import java.util.Arrays;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        boolean[][] canvas = new boolean[h][];
        for (int y = 0; y < h; y++) {
            canvas[y] = new boolean[w];
            String line = sc.next();
            for (int x = 0; x < w; x++) {
                canvas[y][x] = line.charAt(x) == '#';
            }
        }
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (!canvas[y][x]) {
                    continue;
                }
                if (x > 0 && canvas[y][x - 1]) {
                    continue;
                }
                if (y > 0 && canvas[y - 1][x]) {
                    continue;
                }
                if (x < w - 1 && canvas[y][x + 1]) {
                    continue;
                }
                if (y < h - 1 && canvas[y + 1][x]) {
                    continue;
                }
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
