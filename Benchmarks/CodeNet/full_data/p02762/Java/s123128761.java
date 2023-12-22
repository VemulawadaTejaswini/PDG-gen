import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        UnionFind uf = new UnionFind(n);
        
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            if (p > q) {
                int tmp = p;
                p = q;
                q = tmp;
            }
            uf.unite(p, q);
            
            to[p].add(q);
            to[q].add(p);
        }
        
        List<Integer>[] to2 = new List[n];
        for (int i = 0; i < n; i++) {
            to2[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < k; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            
            to2[p].add(q);
            to2[q].add(p);
        }
        
        for (int i = 0; i < n; i++) {
            int count = uf.size[uf.root(i)];
            count--;
            count -= to[i].size();
            // System.out.println(count + "a");
            
            
            for (Integer x : to2[i]) {
                if (uf.same(x, i)) {
                    count--;
                }
            }
            
            System.out.print(count);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}

class UnionFind {
    int[] par;  // 自身の親
    int[] size; // 自身の属するグループの要素数
    int connectedComponent;

    UnionFind(int n) {
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        
        size = new int[n];
        Arrays.fill(size, 1);
        connectedComponent = n;
    }

    int root(int x) {
        if (par[x] == x) return x;
        return par[x] = root(par[x]);
        // 1-2-4の場合、4の親=2を4の根=1に繋ぎ変えた上で親を返す
        // ↑根まで辿る深さを減らす為
        // return a = b;とは、aにbを代入し、aを返すという意味
    }

    void unite(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        if (rx != ry) {
            par[ry] = rx;
            
            int resize = size[rx] + size[ry];
            size[rx] = resize;
            size[ry] = resize;
            connectedComponent--;
        }
    }

    boolean same(int x, int y) {
        int rx = root(x);
        int ry = root(y);
        return rx == ry;
    }
}