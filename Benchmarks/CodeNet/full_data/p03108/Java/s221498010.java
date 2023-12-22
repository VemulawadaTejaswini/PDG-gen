
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Edge[] edges = new Edge[m + 1];

        UnionFindTree unionFindTree = new UnionFindTree(n);
        for (int i = 1; i <= m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            edges[i] = new Edge(a, b);
        }

        long [] connectNum = new long[m + 2];
        connectNum[m + 1] = 0L;
        for (int i = m; i >= 1; --i) {
            int a = edges[i].a;
            int b = edges[i].b;
            int oldAParent = unionFindTree.find(a);
            int oldBParent = unionFindTree.find(b);
            long oldATreeSize = unionFindTree.treeSize[oldAParent];
            long oldBTreeSize = unionFindTree.treeSize[oldBParent];
            unionFindTree.union(oldAParent, oldBParent);
//            System.out.println("edge: " + i + " a: " + a + " b: " + b);
//            System.out.println("oldAParent: " + oldAParent);
//            System.out.println("oldBParent: " + oldBParent);
//            System.out.println("oldASize: " + oldATreeSize);
//            System.out.println("oldBSize: " + oldBTreeSize);
            int newParent = unionFindTree.find(a);
            long newTreeSize = unionFindTree.treeSize[newParent];
            if (oldAParent != oldBParent) {
                connectNum[i] = connectNum[i + 1] + oldATreeSize * oldBTreeSize;
            } else {
                connectNum[i] = connectNum[i + 1];
            }
         //   System.out.println("m: " + i + " a: " + a + " b: " + b + " connectNum: " + connectNum[i]);

        }
        long totalNum = ((long)n) * (n - 1) / 2;
        for (int i = 1; i <= m; ++i) {
            long ans = totalNum - connectNum[i + 1];
            System.out.println(ans);
        }
    }

    public static class Edge {
        int a;
        int b;
        public Edge(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return a == edge.a &&
                    b == edge.b;
        }

        @Override
        public int hashCode() {

            return Objects.hash(a, b);
        }
    }

    public static class UnionFindTree {
        // nodeNum 个数，下标 [1, nodeNum]
        int nodeNum;
        int [] parent;
        int [] height;
        long [] treeSize;

        public UnionFindTree(int nodeNum) {
            this.nodeNum = nodeNum;
            parent = new int[nodeNum + 1];
            height = new int[nodeNum + 1];
            treeSize = new long[nodeNum + 1];
            for (int i = 1; i <= nodeNum; ++i) {
                parent[i] = i;
                height[i] = 0;
                treeSize[i] = 1L;
            }
        }

        int find(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                return parent[x] = find(parent[x]);
            }
        }

        void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            if (height[rootX] < height[rootY]) {
                parent[rootX] = rootY;
                treeSize[rootY] += treeSize[rootX];
            } else {
                if (height[rootX] == height[rootY]) {
                    height[rootX]++;
                }
                parent[rootY] = rootX;
                treeSize[rootX] += treeSize[rootY];
            }
        }

    }

}
