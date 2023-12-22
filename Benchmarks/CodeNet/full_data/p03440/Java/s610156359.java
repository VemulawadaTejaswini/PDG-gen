import java.util.*;

public class Main {
    private class Data {
        int root, cost;
        boolean fix = false;

        public Data(int root, int cost) {
            this.root = root;
            this.cost = cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        Data data[] = new Data[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            data[i] = new Data(i, a[i]);
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt(), data);
        }
        sc.close();

        if (n == m - 1) {
            System.out.println(0);
            return;
        }

        if (n < 2 * (n - m - 1)) {
            System.out.println("Impossible");
            return;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Data root = root(i, data);
            if (root.root == i) {
                list.add(root.cost);
            }
        }

        System.out.println(list.stream().sorted().limit(2 * (n - m - 1))
            .mapToLong(obj -> obj.intValue()).sum());
    }

    private void link(int src, int dst, Data data[]) {
        Data srcRoot = root(src, data);
        Data dstRoot = root(dst, data);
        int minCost = Math.min(dstRoot.cost, data[src].cost);

        srcRoot.cost = minCost;
        data[dstRoot.root] = new Data(srcRoot.root, minCost);
    }

    private Data root(int n, Data data[]) {
        if (data[n].root == n) {
            return data[n];
        }

        return data[n] = root(data[n].root, data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
