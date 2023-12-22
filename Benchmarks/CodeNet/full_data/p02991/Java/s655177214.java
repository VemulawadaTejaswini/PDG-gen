import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        HashSet<Integer>[] orgGraph = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            orgGraph[i] = new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ", 2);
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            orgGraph[a].add(b);
        }
        boolean[][] cost = new boolean[3][n + 1];
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        ArrayDeque<Integer> next = new ArrayDeque<>();
        String[] last = br.readLine().split(" ", 2);
        int s = Integer.parseInt(last[0]);
        int t = Integer.parseInt(last[1]);
        deq.add(s);
        int idx = 0;
        while (deq.size() > 0) {
            while (deq.size() > 0) {
                int x = deq.poll();
                if (x == t && idx % 3 == 0) {
                    System.out.println(idx / 3);
                    return;
                }
                if (cost[idx % 3][x]) {
                    continue;
                }
                cost[idx % 3][x] = true;
                next.addAll(orgGraph[x]);
            }
            ArrayDeque<Integer> tmp = next;
            next = deq;
            deq = tmp;
            idx++;
        }
        System.out.println(-1);
    }
}