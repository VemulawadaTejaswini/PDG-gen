
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    int[][] s;
    int H;
    int W;
    int bVal = 0;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        W = scanner.nextInt();
        s = new int[H][W];

        for (int i = 0; i < H; i++) {
            char[] c = scanner.next().toCharArray();
            for (int j = 0; j < W; j++) {
                if (c[j] == '.') {
                    s[i][j] = 0;
                } else {
                    s[i][j] = -1;
                    bVal++;
                }
            }
        }
        int tmp = fill(0, 0, 0);
        System.out.println(search(H-1, W-1));
    }

    private int fill(int index, int i, int j) {
        int tmp = Integer.MAX_VALUE;
        if(i == H-1 && j == W -1) {
            if (s[i][j] == -1) {
                s[i][j] = ++index;
            }
            return index;
        }else if (s[i][j] == -1) {
            s[i][j] = ++index;
            if (i + 1 < H) tmp = Math.min(tmp, fill(index, i + 1, j));
            if (j + 1 < W) tmp = Math.min(tmp, fill(index, i, j + 1));
        } else if (s[i][j] > 0 && s[i][j] <= index) {
            return Integer.MAX_VALUE;
        } else if (s[i][j] == 0) {
            if (i + 1 < H) tmp = Math.min(tmp, fill(index, i + 1, j));
            if (j + 1 < W) tmp = Math.min(tmp, fill(index, i, j + 1));
        }
        return tmp;
    }

    private int search(int i, int j) {
        int tmp = Integer.MAX_VALUE;
        if (s[i][j] > 0) {
            return s[i][j];
        } else if (i == 0 && j == 0) {
            return 0;
        } else if (s[i][j] == 0) {
            if (i - 1 >= 0) tmp = Math.min(tmp, search(i - 1, j));
            if (j - 1 >= 0) tmp = Math.min(tmp, search(i, j - 1));
        }
        return tmp;
    }
}