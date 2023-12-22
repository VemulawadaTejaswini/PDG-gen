import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        int[] colors = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        int q = sc.nextInt();
        int[] vArr = new int[q];
        int[] dArr = new int[q];
        int[] cArr = new int[q];
        for (int i = 0; i < q; i++) {
            vArr[i] = sc.nextInt();
            dArr[i] = sc.nextInt();
            cArr[i] = sc.nextInt();
        }
        for (int i = q - 1; i >= 0; i--) {
            ArrayDeque<Integer> deq = new ArrayDeque<>();
            ArrayDeque<Integer> next = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();
            deq.add(vArr[i]);
            for (int j = 0; j <= dArr[i]; j++) {
                while (deq.size() > 0) {
                    int x = deq.poll();
                    if (set.contains(x)) {
                        continue;
                    }
                    if (colors[x] == 0) {
                        colors[x] = cArr[i];
                    }
                    next.addAll(graph[x]);
                }
                ArrayDeque<Integer> tmp = next;
                next = deq;
                deq = tmp;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(colors[i]).append("\n");
        }
        System.out.print(sb);
    }

}
