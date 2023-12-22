import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = Integer.parseInt(sc.next());
        long[][] edge = new long[V][V];
        long INF = 200_000_000_000_000L;
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                edge[i][j] = INF;
            }
        }
        for (int i=0;i<V;i++) {
            String S = sc.next();
            for (int j=0;j<V;j++) {
                if (i==j) {
                    continue;
                }
                if ((int)S.charAt(j)-48==0) {
                    edge[i][j] = INF;
                } else {
                    edge[i][j] = (int)S.charAt(j)-48;
                }
            }
        }
        UnionFind uni = new UnionFind(2*V);
        for (int i=0;i<V;i++) {
            for (int j=0;j<V;j++) {
                if (edge[i][j]==1) {
                    uni.connect(i, V+j);
                    uni.connect(j, V+i);
                }
            }
        }
        int flagg=0;
        for (int i=0;i<V;i++) {
            if (uni.root(i)==uni.root(i+V)) {
                flagg=1;
            }
        }
        // System.out.println(Arrays.deepToString(edge));
        for (int k=0;k<V;k++) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    if(edge[i][k] != INF && edge[k][j] != INF) {
                          if (edge[i][j]>edge[i][k]+edge[k][j]) {
                              edge[i][j] = edge[i][k]+edge[k][j];
                          }
                    }
                }
            }
        }
        int flag = 0;
        for (int i=0;i<V;i++) {
            if (edge[i][i]!=0) {
                System.out.println("NEGATIVE CYCLE");
                flag=1;
                break;
            }
        }
        long max = 0L;
        if (flag==0) {
            for (int i=0;i<V;i++) {
                for (int j=0;j<V;j++) {
                    max = Math.max(max, edge[i][j]+1);
                    // if (edge[i][j]==200_000_000_000_000L) {
                    //     System.out.print("INF");
                    // } else {
                    //     System.out.print(edge[i][j]);
                    // }
                    // if (j==V-1) {
                    //     System.out.println("");
                    // } else {
                    //     System.out.print(" ");
                    // }
                }
            }
        }
        if (flagg==1) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
        // System.out.println(Arrays.deepToString(edge));
    }
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
}