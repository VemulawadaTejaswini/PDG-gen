import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] A = new String[H];
        char[][] a = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            a[i] = A[i].toCharArray();
        }
        for (int i = 0; i < H - 1; i++) {
            for (int j = 0; j < W - 1; j++) {
                if (a[i][j] == '#') {
                    if ((i > 0 && j >0) && a[i][j - 1] == '#' && a[i - 1][j] == '#') {
                        System.out.println("Impossible");
                        return;
                    }
                    if (a[i + 1][j] == '#' && a[i][j + 1] == '#') {
                        System.out.println("Impossible");
                        return;
                    }
                }
            }
        }
        System.out.println("Possible");
    }
}
