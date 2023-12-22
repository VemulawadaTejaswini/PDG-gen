import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] x = new int[m];
        int[] y = new int[m];
        int[] z = new int[m];
        for (int i = 0 ; i < m ; i++) {
            x[i] = sc.nextInt() - 1;
            y[i] = sc.nextInt() - 1;
            z[i] = sc.nextInt() % 2;
        }

        Unionfind uf = new Unionfind(n);
        for (int i = 0 ; i < m ; i++) {
            uf.union(x[i], y[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            set.add(uf.findRoot(i));
        }
        System.out.println(set.size());

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
