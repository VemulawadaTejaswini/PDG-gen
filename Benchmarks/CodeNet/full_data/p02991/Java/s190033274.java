import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ", 2);
        int n = Integer.parseInt(first[0]);
        int m = Integer.parseInt(first[1]);
        HashSet<Integer>[] orgGraph = new HashSet[n + 1];
        HashSet<Integer>[] nextGraph = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            orgGraph[i] = new HashSet<>();
            nextGraph[i] = new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ", 2);
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            orgGraph[a].add(b);
        }
        for (int i = 1; i <= n; i++) {
            for (int ken1 : orgGraph[i]) {
                for (int ken2 : orgGraph[ken1]) {
                    for (int pa : orgGraph[ken2]) {
                        nextGraph[i].add(pa);
                    }
                }
            }
        }
        boolean[] cost = new boolean[n + 1];
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
                if (x == t) {
                    System.out.println(idx);
                    return;
                }
                if (cost[x]) {
                    continue;
                }
                cost[x] = true;
                next.addAll(nextGraph[x]);
            }
            ArrayDeque<Integer> tmp = next;
            next = deq;
            deq = tmp;
            idx++;
        }
        System.out.println(-1);
    }
}