import java.util.*;
 
class Main {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) map.put(i, new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }
        count = 0;
        HashSet<Integer> visited = new HashSet<>();
        visited.add(1);
        dfs(1, visited, map, n);
        System.out.println(count);
    }
    public static void dfs(int node, HashSet<Integer> visited, HashMap<Integer, ArrayList<Integer>> map, int n) {
        if (visited.size() == n) {
            count++;
            return;
        }
        ArrayList<Integer> nextNodes = map.get(node);
        for (int next: nextNodes) {
            if (visited.contains(next)) continue;
            visited.add(next);
            dfs(next, visited, map, n);
            visited.remove(next);
        }
    }
}
