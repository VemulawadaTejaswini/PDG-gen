import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        Point[] order = new Point[m];

        for (int i = 0; i < m; i++) {
            order[i] = new Point(scanner.nextInt() - 1, scanner.nextInt() - 1);
        }

        int ans = 0;

        for (int i = 0; i < m; i++) {
            int[] copied = new int[n];
            System.arraycopy(array, 0, copied, 0, n);
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    continue;
                }
                union(copied, order[j].x, order[j].y);
            }
            int v = find(copied, 0);
            for (int j = 1; j < n; j++) {
                if (v != find(copied, j)) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(ans);
    }

    public static int find(int[] tree,int idx) {
        if(tree[idx]==idx) return idx;
        else return tree[idx] = find(tree,tree[idx]);
    }

    //union idx2 tree to idx1 tree O(a(N))
    public static void union(int[] tree,int idx1,int idx2) {
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
    }
}