import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int maxw = sc.nextInt();
        Sina sina[] = new Sina[4];
        for (int i = 0; i < 4; i++) {
            sina[i] = new Sina(i);
        }

        int w1 = sc.nextInt();
        int v1 = sc.nextInt();
        sina[0].vs.add(v1);
        for (int i = 1; i < n; i++) {
            sina[sc.nextInt() - w1].vs.add(sc.nextInt());
        }

        for (int i = 0; i < 4; i++) {
            sina[i].sums = new int[sina[i].vs.size() + 1];

            sina[i].sums[0] = 0;
            int j = 1;
            for (int v : sina[i].vs) {
                sina[i].sums[j] = sina[i].sums[j - 1] + v;
                j++;
            }
        }

        int ans = 0;
        for (int a = 0; a <= sina[0].vs.size() && a <= n; a++) {
            for (int b = 0; b <= sina[1].vs.size() && b <= (n - a); b++) {
                for (int c = 0; c <= sina[2].vs.size() && c <= (n - a - b); c++) {
                    for (int d = 0; d <= sina[3].vs.size() && d <= (n - a - b - c); d++) {
                        if (maxw < w1 * (a + 2 * b + 3 * c + 4 * d)) {
                            continue;
                        }
                        ans =
                            Math.max(ans, sina[0].sums[a] + sina[1].sums[b] + sina[2].sums[c]
                                + sina[3].sums[d]);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    private class Sina {
        int w;
        List<Integer> vs;
        int sums[];

        public Sina(int w) {
            this.w = w;
            vs = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
