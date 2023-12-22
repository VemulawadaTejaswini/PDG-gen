import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        Set<Integer>[] nodes = new Set[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new HashSet<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            nodes[a].add(b);
            nodes[b].add(a);
        }
        int max_degree = 0;
        int root = 0;
        for (int i = 0; i < N; i++) {
            if (max_degree < nodes[i].size()) {
                max_degree = nodes[i].size();
                root = i;
            }
        }
        Map<Integer, List<Integer>> two_map = new HashMap<>();
        two_map.put(0, new ArrayList<>());
        two_map.put(1, new ArrayList<>());
        two_map.get(0).add(root);
        Set<Integer> unvisited = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unvisited.add(i);
        }
        unvisited.remove(root);
        dfs(two_map, nodes, root, 0, unvisited);
        int mod_zero = two_map.get(0).size();
        int mod_one = two_map.get(1).size();

        Map<Integer, Deque<Integer>> candidates_map = new HashMap<>();
        candidates_map.put(0, new LinkedList<>());
        candidates_map.put(1, new LinkedList<>());
        candidates_map.put(2, new LinkedList<>());
        for (int i = 1; i <= N; i++) {
            candidates_map.get(i % 3).add(i);
        }
        Deque<Integer> zero_candidate = candidates_map.get(0);
        Deque<Integer> one_candidate = candidates_map.get(1);
        Deque<Integer> two_candidate = candidates_map.get(2);
        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        if (N / 3 < mod_zero && N / 3 < mod_one) {
            for (int x : two_map.get(0)) {
                if (!one_candidate.isEmpty()) {
                    ans[x] = one_candidate.poll();
                    continue;
                }
                ans[x] = zero_candidate.poll();
            }
            for (int x : two_map.get(1)) {
                if (!two_candidate.isEmpty()) {
                    ans[x] = two_candidate.poll();
                    continue;
                }
                ans[x] = zero_candidate.poll();
            }
            print(N, ans);
            return;
        }
        if (mod_zero <= N / 3) {
            for (int x : two_map.get(0)) {
                 ans[x] = zero_candidate.poll();
            }
            for (int x : two_map.get(1)) {
                if (!zero_candidate.isEmpty()) {
                    ans[x] = zero_candidate.poll();
                    continue;
                }
                if (!one_candidate.isEmpty()) {
                    ans[x] = one_candidate.poll();
                    continue;
                }
                ans[x] = two_candidate.poll();
            }
            print(N, ans);
            return;
        }
        for (int x : two_map.get(1)) {
            ans[x] = zero_candidate.poll();
        }
        for (int x : two_map.get(0)) {
            if (!zero_candidate.isEmpty()) {
                ans[x] = zero_candidate.poll();
                continue;
            }
            if (!one_candidate.isEmpty()) {
                ans[x] = one_candidate.poll();
                continue;
            }
            ans[x] = two_candidate.poll();
        }
        print(N, ans);
    }
    private void print(int N, int[] ans) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
    private void dfs(Map<Integer, List<Integer>> map, Set<Integer>[] nodes, int current, int distance, Set<Integer> unvisited) {
        if (unvisited.isEmpty()) {
            return;
        }
        Set<Integer> child = nodes[current];
        for (int next : child) {
            if (!unvisited.contains(next)) {
                continue;
            }
            unvisited.remove(next);
            map.get((distance+1)%2).add(next);
            dfs(map, nodes, next, distance + 1, unvisited);
            unvisited.add(next);
        }
    }
}
