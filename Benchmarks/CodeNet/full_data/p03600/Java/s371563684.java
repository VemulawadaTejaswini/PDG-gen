import java.util.*;

public class Main {
static class UnionFind {
    List<Integer> Parent;
    UnionFind(int N) {
        Parent = new ArrayList<Integer>();
        Integer[] values = new Integer[N];
        Arrays.fill(values, -1);
        Parent.addAll(Arrays.asList(values));
    }
    int root(int A) {
        if (Parent.get(A) < 0)
            return A;
        int root = root(Parent.get(A));
        Parent.set(A, root);
        return root;
    }
    int size(int A) {
        return -Parent.get(root(A));
    }

    boolean connect(int A, int B) {
        A = root(A);
        B = root(B);
        if (A == B) {
            return false;
        }

        if (size(A) < size(B)) {
            int temp = A;
            A = B;
            B = temp;
        }

        Parent.set(A, Parent.get(A) + Parent.get(B));
        Parent.set(B, A);

        return true;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[][] A = new int[N][N];
        long ans = 0L;
        ArrayList<int[]> edge = new ArrayList<int[]>();
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[2], o2[2]);
            }
        };
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                A[i][j] = Integer.parseInt(sc.next());
                int[] add = {i, j, A[i][j]};
                edge.add(add);
                ans += A[i][j];
            }
        }
        int[][] B = new int[N][N];
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                B[i][j] = A[i][j];
            }
        }
        for (int k=0;k<N;k++) {
            for (int i=0;i<N;i++) {
                for (int j=0;j<N;j++) {
                    A[i][j] = Math.min(A[i][j], A[i][k]+A[k][j]);
                }
            }
        }
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (A[i][j]!=B[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        Collections.sort(edge, comparator);
        UnionFind uf = new UnionFind(N);
        int[][] dp = new int[N][N];
        int INF = 2_000_000_001;
        for (int i=0;i<N;i++) {
            for (int j=0;j<N;j++) {
                if (i!=j) {
                    dp[i][j]=INF;
                }
            }
        }
        for (int i=0;i<edge.size();i++) {
            int x = edge.get(i)[0];
            int y = edge.get(i)[1];
            int dist = edge.get(i)[2];

            for (int j=0;j<N;j++) {
                if (x!=j && j!=y && (A[x][j]+A[j][y]<=A[x][y])) {
                    ans -= dist;
                    break;
                }
            }
        }
        System.out.println(ans/2);
    }
}