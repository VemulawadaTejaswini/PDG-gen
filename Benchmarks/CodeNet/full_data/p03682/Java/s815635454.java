
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node ns[] = new Node[n];
        for (int i = 0; i < n; i++) {
            ns[i] = new Node(i, sc.nextLong(), sc.nextLong());
        }

        long mincost[] = new long[n];
        boolean used[] = new boolean[n];
        Arrays.fill(mincost, Long.MAX_VALUE);

        mincost[0] = 0;
        long res = 0;
        while (true) {
            int v = -1;
            for (int i = 0; i < n; i++) {
                if (!used[i] && (v == -1 || mincost[i] < mincost[v])) v = i;
            }
            if (v == -1) break;
            used[v] = true;
            res += mincost[v];

            for (int i = 0; i < n; i++) {
                mincost[i] = Math.min(mincost[i], Math.min(Math.abs(ns[i].x - ns[v].x),
                        Math.abs(ns[i].y - ns[v].y)));
            }
        }
        System.out.println(res);
    }

    static class Node {
        int id;
        long x, y;
        long nearestX, nearestY;
        Node(int id, long x, long y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }


}
