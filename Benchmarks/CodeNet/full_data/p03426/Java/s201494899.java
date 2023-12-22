import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w = in.nextInt(), d = in.nextInt();
        List<Grid> list = new ArrayList<>();
        list.add(new Grid(0, 0, 0));
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                list.add(new Grid(in.nextInt(), i, j));
            }
        }
        list.sort(Comparator.comparing(Grid::getA));
        int[] cost = new int[h * w + 1];
        for (int k = 1; k <= d; k++) {
            cost[k] = 0;
            for(int i = k + d; i < cost.length; i += d) {
                cost[i] = cost[i - d]
                        + Math.abs(list.get(i).getX() - list.get(i - d).getX())
                        + Math.abs(list.get(i).getY() - list.get(i - d).getY());
            }
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int l = in.nextInt(), r = in.nextInt();
            System.out.println(cost[r] - cost[l]);
        }
    }
}

class Grid {
    int a;
    int x;
    int y;
    public Grid(int a, int x, int y) {
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
