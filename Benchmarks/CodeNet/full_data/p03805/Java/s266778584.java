import java.util.*;

public class Main {
    int map[][];
    int ans = 0;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        map = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a - 1][b - 1] = 1;
            map[b - 1][a - 1] = 1;
        }

        foo(1, n, new int[n], new BitSet());

        System.out.println(ans);
    }

    private void foo(int p, int n, int data[], BitSet bs) {
        if (p == n) {
            check(n, data);
            return;
        }

        for (int i = 1; i < n; i++) {
            if (!bs.get(i)) {
                data[p] = i;
                bs.set(i);
                foo(p + 1, n, data, bs);
                bs.clear(i);
            }
        }
    }

    private void check(int n, int data[]) {
        for (int i = 0; i < n - 1; i++) {
            if (map[data[i]][data[i + 1]] != 1) {
                return;
            }
        }

        ans++;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().main(sc);
        } catch (Exception e) {
            throw e;
        }
    }
}
