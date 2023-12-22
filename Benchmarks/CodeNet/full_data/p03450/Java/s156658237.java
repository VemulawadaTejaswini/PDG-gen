import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l[] = new int[m];
        int r[] = new int[m];
        int d[] = new int[m];
        List<Info>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<Info>();
        }
        for (int i = 0; i < m; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
            d[i] = sc.nextInt();
            Info ri = new Info(r[i] - 1, d[i]);
            Info le = new Info(l[i] - 1, -d[i]);
            list[l[i] - 1].add(ri);
            list[r[i] - 1].add(le);
        }
        int x[] = new int[n];
        Arrays.fill(x, Integer.MAX_VALUE);
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            if (x[i] == Integer.MAX_VALUE) {
                x[i] = 0;
                ans &= DFS(i, x, list);

            }
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean DFS(int i, int[] x, List<Info>[] lists) {
        List<Info> xlist = lists[i];
        for (int j = 0; j < xlist.size(); j++) {
            int to = xlist.get(j).to;
            int cost = xlist.get(j).cost;
            if (x[to] == Integer.MAX_VALUE) {
                x[to] = x[i] + cost;
                if (!DFS(to, x, lists)) {
                    return false;
                }
            } else {
                if (x[to] != x[i] + cost) {
                    return false;
                }
            }

        }
        return true;
    }
}

class Info {
    int to;
    int cost;

    Info(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}