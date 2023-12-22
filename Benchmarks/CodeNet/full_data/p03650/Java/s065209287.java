import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n;
    int[] ps;
    int[] nums;
    List<List<Pair>> graph;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        ps = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt() -1;
        }
        solve();
    }

    void solve() {
        nums = new int[n];
        Arrays.fill(nums, -1);
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new LinkedList<>());
        }
        for (int i = 0; i < n; i++) {
            graph.get(i).add(new Pair(ps[i], false));
            graph.get(ps[i]).add(new Pair(i, true));
        }
        boolean[] visited = new boolean[n];
        List<Integer> cycle = new ArrayList<>();
        visited[0] = true;
        int j = 0;
        while(!visited[ps[j]]) {
            j = ps[j];
            visited[j] = true;
        }
        cycle.add(ps[j]);
        j = ps[j];
        int k = j;
        while (k != ps[j]) {
            cycle.add(ps[j]);
            j = ps[j];
        }
        int[] cycleNums = new int[cycle.size()];
        Set<Integer> cycleSet = new HashSet<>();
        cycleSet.addAll(cycle);
        for (int i = 0; i < cycle.size(); i++) {
            int max = -1;
            for (Pair p : graph.get(cycle.get(i))) {
                if (cycleSet.contains(p.to)) {
                    continue;
                }
                dfs(p.to);
                if (max < nums[p.to]) {
                    max = nums[p.to];
                }
            }
            cycleNums[i] = ++max;
        }
        boolean flag = true;
        int[] memo = cycleNums.clone();
        int first = cycleNums[0];
        //System.out.println(first);
        for (int i = 1; i < cycle.size(); i++) {
            //System.out.println(first + " " + cycle.get(i) + " " + cycleNums[i]);
            if (first == 0) {
                if (memo[i] == 0) {
                    memo[i] = 1;
                }
            } else if (memo[i] == first) {
                memo[i] = first + 1;
            } else if (memo[i] != 0 && memo[i] != first + 1) {
                flag = false;
                break;
            }
            first = memo[i];
        }
        if (flag && (memo[0] == 0 && memo[cycle.size() - 1] != 0 ||
                memo[cycle.size() - 1] + 1 == memo[0])) {
            System.out.println("POSSIBLE");
            return;
        }
        //System.out.println();

        flag = true;
        memo = cycleNums.clone();
        first = cycleNums[0] + 1;
        memo[0] = first;
        //System.out.println(first);
        for (int i = 1; i < cycle.size(); i++) {
            //System.out.println(first + " " + cycle.get(i) + " " + cycleNums[i]);
            if (first == 0) {
                if (memo[i] == 0) {
                    memo[i] = 1;
                }
            } else if (memo[i] == first) {
                memo[i] = first + 1;
            } else if (memo[i] != 0 && memo[i] != first + 1) {
                flag = false;
                break;
            }
            first = memo[i];
        }
        //System.out.println(Arrays.toString(memo));
        if (flag && (memo[0] == 0 && memo[cycle.size() - 1] != 0 ||
                memo[cycle.size() - 1] + 1 == memo[0])) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    void dfs(int start) {
        if (graph.get(start).size() == 0) {
            nums[start] = 0;
            return;
        }
        int max = -1;
        for (Pair p : graph.get(start)) {
            if (p.out) {
                dfs(p.to);
            }
        }
        for (Pair p : graph.get(start)) {
            if (p.out && nums[p.to] > max) {
                max = nums[p.to];
            }
        }
        nums[start] = ++max;
    }

    class Pair {
        int to;
        boolean out;

        public Pair(int to, boolean out) {
            this.to = to;
            this.out = out;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
