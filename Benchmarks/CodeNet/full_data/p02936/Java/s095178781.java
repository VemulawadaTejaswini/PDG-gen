import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = a > b ? a : b;
            int p = a > b ? b : a;
            if (map.containsKey(p)) {
                map.get(p).add(c);
            } else {
                List<Integer> l = new ArrayList<Integer>();
                l.add(c);
                map.put(p, l);
            }
        }

        long[] count = new long[n];
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            count[p - 1] += x;
        }
        countChildren(map, count, 0);

        for (long c : count) {
            System.out.print(c + " ");
        }
        sc.close();
    }

    private static void countChildren(Map<Integer, List<Integer>> graph, long[] count, int pIdx) {
        long score = count[pIdx];
        if (graph.containsKey(pIdx)) {
            for (int cIdx : graph.get(pIdx)) {
                count[cIdx] += score;
                countChildren(graph, count, cIdx);
            }
        }
    }
}
