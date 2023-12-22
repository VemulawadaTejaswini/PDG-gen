import java.util.*;

public class Main {

    static class DisjointUnionSets {
        int[] rank, parent;
        int n;

        public DisjointUnionSets(int n) {
            rank = new int[n];
            parent = new int[n];
            this.n = n;
            makeSet();
        }

        void makeSet() {
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }

            return parent[x];
        }

        void union(int x, int y) {
            int xRoot = find(x), yRoot = find(y);

            if (xRoot == yRoot)
                return;

            if (rank[xRoot] < rank[yRoot])
                parent[xRoot] = yRoot;
            else if (rank[yRoot] < rank[xRoot])
                parent[yRoot] = xRoot;
            else {
                parent[yRoot] = xRoot;
                rank[xRoot] = rank[xRoot] + 1;
            }
        }
    }

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);

    }

    private static void finish() {
    }


    public static void main(String[] args) {
        start();

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        DisjointUnionSets disjointUnionSets = new DisjointUnionSets(n);
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            disjointUnionSets.union(x, y);
        }

        long total = 0;
        HashSet<Integer> used = new HashSet<>();
        while (true) {
            int parent = disjointUnionSets.find(0);
            boolean finish = true;
            for (int i = 0; i < n; i++) {
                if (disjointUnionSets.find(i) != parent) {
                    finish = false;
                    break;
                }
            }
            if (finish) {
                System.out.println(total);
                break;
            }

            List<Integer> firstGroup = new ArrayList<>();
            List<Integer> secondGroup = new ArrayList<>();
            int parent2 = -1;
            for (int i = 0; i < n; i++) {
                if (disjointUnionSets.find(i) == parent && !used.contains(i)) {
                    firstGroup.add(i);
                } else if (disjointUnionSets.find(i) != parent && !used.contains(i)) {
                    parent2 = disjointUnionSets.find(i);
                }
            }
            if (parent2 == -1 || firstGroup.size() == 0) {
                System.out.println("Impossible");
                break;
            }
            for (int i = 0; i < n; i++) {
                if (disjointUnionSets.find(i) == parent2 && !used.contains(i)) {
                    secondGroup.add(i);
                }
            }
            if (secondGroup.size() == 0) {
                System.out.println("Impossible");
                break;
            }
            int cheapestFirst = -1;
            int cheapest1Value = Integer.MAX_VALUE;
            int cheapestSecond = -1;
            int cheapest2Value = Integer.MAX_VALUE;
            for (int i = 0; i < firstGroup.size(); i++) {
                if (a[firstGroup.get(i)] < cheapest1Value) {
                    cheapestFirst = firstGroup.get(i);
                    cheapest1Value = a[firstGroup.get(i)];
                }
            }
            for (int i = 0; i < secondGroup.size(); i++) {
                if (a[secondGroup.get(i)] < cheapest2Value) {
                    cheapestSecond = secondGroup.get(i);
                    cheapest2Value = a[secondGroup.get(i)];
                }
            }
            if (cheapestFirst == -1 || cheapestSecond == -1) {
                System.out.println("Impossible");
                break;
            }
            total += cheapest1Value + cheapest2Value;
            used.add(cheapestFirst);
            used.add(cheapestSecond);
            disjointUnionSets.union(cheapestFirst, cheapestSecond);
        }

        finish();
    }
}
