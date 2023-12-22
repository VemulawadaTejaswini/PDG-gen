import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        Unionfind uf = new Unionfind(n + m + m);
        for (int i = 0 ; i < n ; i++) {
            k[i] = sc.nextInt();
            for (int j = 0 ; j < k[i] ; j++) {
                int l = sc.nextInt() + n;
                uf.union(i, l);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++) {
            set.add(uf.findRoot(i));
        }
        System.out.println(set.size() == 1 ? "Yes" : "No");
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
