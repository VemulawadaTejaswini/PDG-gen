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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int ans = 0;
            for (int n: road.children(i)) {
                if (rail.children(i).contains(n)) {
                    ans++;
                }
            }
            sb.append(ans);
            sb.append(' ');
        }
        System.out.println(sb.toString().trim());
    }

    static class UFT {
        int n;
        int[] par;
        List<Set<Integer>> children;

        UFT(int n) {
            this.n = n;
            par = new int[n];
            children = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                par[i] = i;
                children.add(new HashSet<>());
                children.get(i).add(i);
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
            par[yr] = xr;
            children.get(xr).addAll(children.get(yr));
        }

        Set<Integer> children(int x) {
            int xr = root(x);
            return children.get(xr);
        }
    }
}
