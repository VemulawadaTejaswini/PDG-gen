import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        boolean[][] canvas = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] arr = scanner.next().toCharArray();
            for (int j = 0; j < w; j++) {
                canvas[i][j] = arr[j] == '#';
            }
        }

        String ans = "Yes";
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!canvas[i][j]) continue;
                boolean res = false;
                if (i > 0) res = canvas[i - 1][j];
                if (i < h - 1) res |= canvas[i + 1][j];
                if (j > 0) res |= canvas[i][j - 1];
                if (j < w - 1) res |= canvas[i][j + 1];
                if (!res) ans = "No";
                break;
            }
            if (ans.equals("No")) break;
        }
        System.out.println(ans);
    }
}
