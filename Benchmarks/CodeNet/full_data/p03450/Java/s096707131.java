import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static final int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer>[] d = new HashMap[n+1];
        for (int i = 0; i <= n; i++) {
            d[i] = new HashMap<Integer, Integer>();
        }

        for (int i = 0; i < m; i++) {
            int xLi = sc.nextInt();
            int xRi = sc.nextInt();
            int xDi = sc.nextInt();
            d[xLi].put(xRi, xDi);
            d[xRi].put(xLi, -xDi);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        int[] pos = new int[n+1];
        Arrays.fill(pos, MAX);

        for (int i = 1; i <= n; i++) {
            if (pos[i] != MAX) continue;

            q.add(i);
            pos[i] = 0;
            while (!q.isEmpty()) {
                int f = q.poll();

                for (Integer k : d[f].keySet()) {
                    Integer vFK = d[f].get(k);

                    if (pos[k] != MAX) {
                        if (pos[k] != pos[f] + vFK) {
                            System.out.println("No");
                            return;
                        }
                    } else {
                        q.add(k);
                        pos[k] = pos[f] + vFK;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
