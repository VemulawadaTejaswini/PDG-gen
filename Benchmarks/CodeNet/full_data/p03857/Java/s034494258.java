import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), K = scanner.nextInt(), L = scanner.nextInt();
        scanner.nextLine();

        UFT road = new UFT(N);
        for (int i = 0; i < K; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            road.merge(e[0] - 1, e[1] - 1);
        }

        UFT rail = new UFT(N);
        for (int i = 0; i < L; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            rail.merge(e[0] - 1, e[1] - 1);
        }

        Map<String, Integer> parentToCnt = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String key = String.format("%d:%d", road.root(i), rail.root(i));
            parentToCnt.put(key, parentToCnt.getOrDefault(key, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String key = String.format("%d:%d", road.root(i), rail.root(i));
            sb.append(parentToCnt.get(key));
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

    static class UFT {
        int n;
        int[] par;
        int[] rank;

        UFT(int n) {
            this.n = n;
            par = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                par[i] = i;
            }
        }

        int root(int x) {
            if (par[x] != x) {
                int root = root(par[x]);
                par[x] = root;
                return root;
            } else {
                return x;
            }
        }

        void merge(int x, int y) {
            int xr = root(x);
            int yr = root(y);
            if (rank[xr] < rank[yr]) {
                par[xr] = yr;
            } else {
                par[yr] = xr;
                if (rank[xr] == rank[yr]) {
                    rank[xr]++;
                }
            }
        }
    }
}
