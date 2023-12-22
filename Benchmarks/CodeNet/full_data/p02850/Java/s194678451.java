import java.util.*;

public class Main {
    static int[] ans;
    static HashMap<Integer, ArrayList<Edge>> map;
    static int max = -1;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ans = new int[n-1];
        map = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            if (map.containsKey(from)) {
                map.get(from).add(new Edge(to, i));
            } else {
                ArrayList<Edge> list = new ArrayList<>();
                list.add(new Edge(to, i));
                map.put(from, list);
            }
        }
        dfs(1, -1);
        System.out.println(max);
        for(int i = 0; i < n-1; i++) {
            System.out.println(ans[i]);
        }
    }

    static void dfs(int currNode, int prevColor) {
        int color = 1;
        if (!map.containsKey(currNode)) return;
        for (Edge edge: map.get(currNode)) {
            if (color == prevColor) color++;
            dfs(edge.to, color);
            ans[edge.id] = color;
            max = Math.max(max, color);
            color++;
        }
    }

    static class Edge {
        int to;
        int id;
        Edge(int to, int id) {
            this.to = to;
            this.id = id;
        }
    }
}
