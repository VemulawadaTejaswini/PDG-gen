import java.util.*;

public class Main {
    static int[][] dp;
    static Scanner sc;
    static int n;
    static int m;
    static List<Set<Integer>> graph;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int n1 = 0;
        int n2 = 0;
        graph = new ArrayList<>(n+1);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>(8));
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            if(b < a) {
                int c = a;
                a = b;
                b = c;
            }
            graph.get(a).add(b);
            n1 = a;
            n2 = b;
        }

        LinkedList<Integer> path = new LinkedList<>();
        path.add(n1);
        path.add(n2);
        boolean flag = true;
        while (flag) {
            flag = false;
            int first = path.getFirst();
            for (int i = 0; i < n; i++) {
                if (((first < i && graph.get(first).contains(i)) || (first > i &&graph.get(i).contains(first)))&& !path.contains(i)) {
                    path.addFirst(i);
                    flag = true;
                    break;
                }
            }
            int last = path.getLast();
            for (int i = 0; i < n; i++) {
                if (((last < i &&graph.get(last).contains(i)) || (last > i &&graph.get(i).contains(last))) && !path.contains(i)) {
                    path.addLast(i);
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(path.size());
        for (Integer i : path) {
            System.out.print((i + 1) + " ");
        }
    }
}
