import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;
            if (!edges.containsKey(x)) {
                edges.put(x, new ArrayList<Integer>());
            }
            if (!edges.containsKey(y)) {
                edges.put(y, new ArrayList<Integer>());
            }
            edges.get(x).add(y);
            edges.get(y).add(x);
        }
        System.out.println(solve(n, m, data, edges));
    }

    public static int solve(int n, int m, int[] data, HashMap<Integer, List<Integer>> edges) {
        int[] check = new int[n];
        int proper = 0;
        for(int i = 0; i < n; i++) {
            check[data[i]-1] = i;
            if (data[i] == i - 1) {
                proper++;
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (is_reachable(check[i], i, edges)) {
                count++;
            }
        }
        return count;
    }
    public static boolean is_reachable(int from, int to, HashMap<Integer, List<Integer>> edges) {
        if (from == to) {
            return true;
        }
        HashSet<Integer> examined = new HashSet<Integer>();
        examined.add(to);
        return _reachable(to, from, edges, examined);
    }
    public static boolean _reachable(int current, int target, HashMap<Integer, List<Integer>> edges, HashSet<Integer> examined) {
        if (!edges.containsKey(current)) {
            return false;
        }
        List<Integer> next_nodes = edges.get(current);
        for(int next : next_nodes) {
            if (examined.contains(next)) {
                continue;
            }
            if (next == target) {
                return true;
            }
            examined.add(next);
            if(_reachable(next, target, edges, examined)) {
                return true;
            }
            examined.remove(next);
        }
        return false;
    }

}
