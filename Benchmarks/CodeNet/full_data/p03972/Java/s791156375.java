import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p[] = new int[w];
        int q[] = new int[h];

        long ans = 0;
        for (int i = 0; i < w; i++) {
            p[i] = sc.nextInt();
            ans += p[i];
        }

        for (int i = 0; i < h; i++) {
            q[i] = sc.nextInt();
            ans += q[i];
        }

        Arrays.sort(q);
        long qsum[] = new long[h + 1];
        for (int i = 0; i < h; i++) {
            qsum[i + 1] = qsum[i] + q[i];
        }

        for (int i = 0; i < w; i++) {
            int cnt = search(q, p[i]);
            ans += (h - cnt) * p[i] + qsum[cnt];
        }
        System.out.println(ans);
    }

    private int search(int n[], int p) {
        int l = 0;
        int r = n.length - 1;

        if (n[0] > p) {
            return 0;
        }
        if (n[r] < p) {
            return r + 1;
        }

        int c = 0;
        while (l < r) {
            c = (l + r) / 2;
            if (n[c] < p) {
                l = c + 1;
            } else {
                r = c;
            }
        }

        return c + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
