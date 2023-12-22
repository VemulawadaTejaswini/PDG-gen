import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] S = new String[H];
        char[][] s = new char[H][W];
        for (int i = 0; i < H; i++) {
            S[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            s[i] = S[i].toCharArray();
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (s[i][j] == '.') {
                    continue;
                } else if (i < H - 1 && s[i + 1][j] == '#') {
                    continue;
                } else if (i > 0 && s[i - 1][j] == '#') {
                    continue;
                } else if (j < W - 1 && s[i][j + 1] == '#') {
                    continue;
                } else if (j > 0 && s[i][j - 1] == '#') {
                    continue;
                } else {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}