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
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        int[] C = new int[K];
        int[] D = new int[K];
        ArrayList<ArrayList<Integer>> friend = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> block = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            friend.add(add);
        }
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            block.add(add);
        }
        UnionFind uf = new UnionFind(N);
        for (int i=0;i<M;i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
            uf.connect(A[i], B[i]);
            friend.get(A[i]).add(B[i]);
            friend.get(B[i]).add(A[i]);
        }
        for (int i=0;i<K;i++) {
            C[i] = sc.nextInt()-1;
            D[i] = sc.nextInt()-1;
            block.get(C[i]).add(D[i]);
            block.get(D[i]).add(C[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<N;i++) {
            long ans = 0L;
            ans+=uf.size(i);
            int root = uf.root(i);
            HashSet<Integer> rem = new HashSet<Integer>();
            for (Integer j : friend.get(i)) {
                if (!rem.contains(j) && uf.root(j)==root) {
                    rem.add(j);
                    ans--;
                }
            }
            for (Integer j : block.get(i)) {
                if (!rem.contains(j) && uf.root(j)==root) {
                    rem.add(j);
                    ans--;
                }
            }
            sb.append(ans-1);
            if (i!=N-1) sb.append(" ");
        }
        System.out.println(sb);
    }
}