import java.util.*;

public class Main {
    int[] ans;
    int[] tree;

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        ans = new int[n];
        tree = new int[n];

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            tree[b] = a;
        }

        for (int i = 0; i < q; i++) {
            int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            ans[p] += x;
        }

        System.out.print(ans[0]);
        for (int i = 1; i < n; i++) {
            int parent = tree[i];
            ans[i] += ans[parent];
            System.out.print(" ");
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
