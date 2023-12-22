import java.util.*;

public class Main {
    private static final int INF = 114514;

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();

        int map[][] = new int[401][401];
        for (int i = 0; i <= 400; i++) {
            Arrays.fill(map[i], INF);
        }

        map[0][0] = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for (int j = 400; j >= a; j--) {
                for (int k = 400; k >= b; k--) {
                    map[j][k] = Math.min(map[j][k], map[j - a][k - b] + c);
                }
            }
        }

        int ans = INF;
        for (int i = 1; (ma * i <= 400) && (mb * i <= 400); i++) {
            ans = Math.min(ans, map[i * ma][i * mb]);
        }
        System.out.println(ans == INF ? -1 : ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
