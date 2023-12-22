import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Route>> graph = new ArrayList<>();
        ArrayList<HashMap<Integer, Integer>> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
            results.add(new HashMap<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            graph.get(a).add(new Route(b, c));
            graph.get(b).add(new Route(a, c));
        }
        PriorityQueue<Path> queue = new PriorityQueue<>();
        queue.add(new Path(0, 0, 0));
        while (queue.size() > 0) {
            Path p = queue.poll();
            if (results.get(p.idx).containsKey(p.company)) {
                continue;
            }
            results.get(p.idx).put(p.company, p.value);
            for (Route r : graph.get(p.idx)) {
                if (!results.get(p.idx).containsKey(r.company)) {
                    results.get(p.idx).put(r.company, p.value);
                }
                if (results.get(r.idx).containsKey(r.company)) {
                    continue;
                }
                int next = p.value;
                if (r.company != p.company) {
                    next++;
                }
                queue.add(new Path(r.idx, next, r.company));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int x : results.get(n - 1).values()) {
            min = Math.min(min, x);
        }
        System.out.println(min);
    }
    
    static class Route {
        int idx;
        int company;
        
        public Route(int idx, int company) {
            this.idx = idx;
            this.company = company;
        }
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;
        int company;
        
        public Path(int idx, int value, int company) {
            this.idx = idx;
            this.value = value;
            this.company = company;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}