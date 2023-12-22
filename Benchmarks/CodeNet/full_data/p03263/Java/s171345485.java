import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static class Pos {
        int y;
        int x;
        int yy;
        int xx;

        public Pos(int y, int x, int yy, int xx) {
            this.y = y;
            this.x = x;
            this.yy = yy;
            this.xx = xx;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        List<Pos> list = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w - 1; j++) {
                if (a[i][j] % 2 == 0) {
                    continue;
                }
                a[i][j]--;
                a[i][j + 1]++;
                list.add(new Pos(i, j, i, j + 1));
            }
        }
        for (int i = 0; i < h - 1; i++) {
            if (a[i][w - 1] % 2 == 0) {
                continue;
            }
            a[i][w - 1]--;
            a[i + 1][w - 1]++;
            list.add(new Pos(i, w - 1, i + 1, w - 1));
        }
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder();
            Pos p = list.get(i);
            sb.append(p.y + 1);
            sb.append(" ");
            sb.append(p.x + 1);
            sb.append(" ");
            sb.append(p.yy + 1);
            sb.append(" ");
            sb.append(p.xx + 1);
            System.out.println(sb);
        }
    }
}
