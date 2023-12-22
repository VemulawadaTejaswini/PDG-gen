import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        long[] answer = d.solve();
        int M = answer.length;
        for (int i = 0; i < M; i++) {
            System.out.println(answer[M - 1 - i]);
        }
    }

    public long[] solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        List<String> edge_list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            A[i] = scan.nextInt() - 1;
            B[i] = scan.nextInt() - 1;
        }
        UnionFind union_find = new UnionFind(N);
        long[] answer = new long[M];
        long current_answer = new BigInteger(Integer.toString(N)).multiply(new BigInteger(Integer.toString(N - 1)).divide(new BigInteger("2")).longValue();
        int i = 0;
        do {
            answer[i] = current_answer;
            int a_parent = union_find.find(A[M - 1 - i]);
            int b_parent = union_find.find(B[M - 1 - i]);
            if (a_parent != b_parent) {
                current_answer = current_answer - union_find.size(a_parent) * union_find.size(b_parent);
            }
            union_find.unite(A[M - 1 - i], B[M - 1 - i]);
            i += 1;
        } while (i < M);
        return answer;
    }

    class UnionFind {
        private int[] parent = null;
        private int[] rank = null;
        private int[] size = null;
        public UnionFind(int N) {
            int[] parent = new int[N];
            int[] rank = new int[N];
            int[] size = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                rank[i] = 0;
                size[i] = 1;
            }
            this.parent = parent;
            this.rank = rank;
            this.size = size;
        }

        public int size(int x) {
            int parent = this.find(x);
            return this.size[parent];
        }
        public void unite(int x, int y) {
            x = this.find(x);
            y = this.find(y);
            if (x == y) {
                return;
            }
            int size_x = this.size[x];
            int size_y = this.size[y];
            this.size[y] += size_x;
            this.size[x] += size_y;
            if (this.rank[x] < this.rank[y]) {
                this.parent[x] = y;
                return;
            }
            this.parent[y] = x;
            if (this.rank[x] == this.rank[y]) {
                this.rank[x] += 1;
            }
        }

        public int find(int x) {
            if (this.parent[x] == x) {
                return x;
            }
            return this.parent[x] = find(this.parent[x]);
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }
    }
}
