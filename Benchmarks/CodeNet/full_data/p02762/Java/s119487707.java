import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        ArrayList<Integer>[] friends = new ArrayList[n];
        ArrayList<Integer>[] blocks = new ArrayList[n];
        for (int i = 0 ; i < n ; i++) {
            friends[i] = new ArrayList<>();
            blocks[i] = new ArrayList<>();
        }
        for (int i = 0 ; i < m ; i++) {
            a[i] = sc.nextInt() - 1;
            b[i] = sc.nextInt() - 1;
            friends[a[i]].add(b[i]);
            friends[b[i]].add(a[i]);
        }
        int[] c = new int[k];
        int[] d = new int[k];
        for (int i = 0 ; i < k ; i++) {
            c[i] = sc.nextInt() - 1;
            d[i] = sc.nextInt() - 1;
            blocks[c[i]].add(d[i]);
            blocks[d[i]].add(c[i]);
        }
        Unionfind uf = new Unionfind(n);
        for (int i = 0 ; i < m ; i++) {
            uf.union(a[i], b[i]);
        }

        for (int i = 0 ; i < n ; i++) {
            int ans = uf.size(i);
            ans -= friends[i].size() + 1;
            for (int x : blocks[i]) {
                if (uf.same(x, i)) {
                    ans--;
                }
            }
            System.out.print(ans);
            if (i != n - 1) {
                System.out.print(" ");
            } else {
                System.out.print("\n");
            }
        }
    }

}

class Unionfind {
    ArrayList<Integer> parent;

    public Unionfind(int n) {
        parent = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            parent.add(-1);
        }
    }

    public boolean union(int x, int y) {
        x = findRoot(x);
        y = findRoot(y);
        if (x == y) {
            return false;
        }

        if (size(x) < size(y)) {
            int temp = x;
            x = y;
            y = temp;
        }

        parent.set(x, parent.get(x) + parent.get(y));
        parent.set(y, x);
        return true;
    }

    public int findRoot(int i) {
        if (parent.get(i) < 0) {
            return i;
        } else {
            int root = findRoot(parent.get(i));
            parent.set(i, root);
            return root;
        }
    }

    public int size(int x) {
        return -parent.get(findRoot(x));
    }

    public boolean same(int x, int y) {
        return findRoot(x) == findRoot(y);
    }
}