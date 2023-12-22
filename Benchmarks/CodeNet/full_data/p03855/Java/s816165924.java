import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int L = sc.nextInt();
        int[] p = new int[K];
        int[] q = new int[K];
        for (int i = 0; i < K; ++i) {
            p[i] = sc.nextInt() - 1;
            q[i] = sc.nextInt() - 1;
        }
        int[] r = new int[L];
        int[] s = new int[L];
        for (int i = 0; i < L; ++i) {
            r[i] = sc.nextInt() - 1;
            s[i] = sc.nextInt() - 1;
        }

        System.out.println(solve(N, p, q, r, s));

        sc.close();
    }

    static String solve(int N, int[] p, int[] q, int[] r, int[] s) {
        int[] roadParents = buildParents(N, p, q);
        int[] railwayParents = buildParents(N, r, s);

        Element[] elements = new Element[N];
        for (int i = 0; i < elements.length; ++i) {
            elements[i] = new Element(-1, 1);
        }

        for (int i = 0; i < p.length; ++i) {
            if (findRoot(railwayParents, p[i]) == findRoot(railwayParents, q[i])) {
                int root1 = findRoot(elements, p[i]);
                int root2 = findRoot(elements, q[i]);

                if (root1 != root2) {
                    elements[root2].parent = root1;
                    elements[root1].size += elements[root2].size;
                }
            }
        }

        for (int i = 0; i < r.length; ++i) {
            if (findRoot(roadParents, r[i]) == findRoot(roadParents, s[i])) {
                int root1 = findRoot(elements, r[i]);
                int root2 = findRoot(elements, s[i]);

                if (root1 != root2) {
                    elements[root2].parent = root1;
                    elements[root1].size += elements[root2].size;
                }
            }
        }

        return IntStream.range(0, N).mapToObj(i -> String.valueOf(elements[findRoot(elements, i)].size))
                .collect(Collectors.joining(" "));
    }

    static int[] buildParents(int N, int[] x, int[] y) {
        int[] parents = new int[N];
        Arrays.fill(parents, -1);

        for (int i = 0; i < x.length; ++i) {
            int root1 = findRoot(parents, x[i]);
            int root2 = findRoot(parents, y[i]);

            if (root1 != root2) {
                parents[root2] = root1;
            }
        }

        return parents;
    }

    static int findRoot(int[] parents, int node) {
        int root = node;
        while (parents[root] != -1) {
            root = parents[root];
        }

        int p = node;
        while (p != root) {
            int next = parents[p];
            parents[p] = root;

            p = next;
        }

        return root;
    }

    static int findRoot(Element[] elements, int node) {
        int root = node;
        while (elements[root].parent != -1) {
            root = elements[root].parent;
        }

        int p = node;
        while (p != root) {
            int next = elements[p].parent;
            elements[p].parent = root;

            p = next;
        }

        return root;
    }
}

class Element {
    int parent;
    int size;

    Element(int parent, int size) {
        this.parent = parent;
        this.size = size;
    }
}