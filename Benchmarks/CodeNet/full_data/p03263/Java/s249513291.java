import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    final int MOD = 1_000_000_007;

    public void run() {
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        List<Ans> ans = new ArrayList<>();
        int y = 0, x = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (a[i][j] % 2 != 0 && y == 0) {
                    y = i + 1;
                    x = j + 1;
                    continue;
                }
                if (a[i][j] % 2 != 0 && y != 0) {
                    Ans tmp = new Ans();
                    tmp.y = y;
                    tmp.x = x;
                    tmp.yy = i + 1;
                    tmp.xx = j + 1;
                    ans.add(tmp);
                    y = 0;
                    x = 0;
                }
            }
        }
        System.out.println(ans.size());
        for (Ans aa : ans) {
            System.out.println(aa.toString());
        }
    }

    class Ans {

        int y, x, yy, xx;

        public String toString() {
            return y + " " + x + " " + yy + " " + xx;
        }
    }
}
