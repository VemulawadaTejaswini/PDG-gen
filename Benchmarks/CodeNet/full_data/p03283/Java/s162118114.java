import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int[][] tar = new int[m][2];
        int[] anss = new int[q];

        for (int i = 0; i < m; i++) {
            tar[i][0] = sc.nextInt();
            tar[i][1] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int ans = 0;
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();

            for (int j = 0; j < m; j++) {
                if (tar[j][0] >= q1 && tar[j][1] <= q2) {
                    ans++;
                }
            }
            anss[i] = ans;
        }

        for (int ans : anss) {
            System.out.println(ans);
        }
    }
}
