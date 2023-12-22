import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        int[][] m = new int[C][100_000+2];

        for (int i = 0; i < N; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            m[c-1][s]++;
            m[c-1][t+1]--;
        }

        for (int i = 0; i < C; i++) {
            for (int j = 1; j < m[i].length; j++) {
                m[i][j] += m[i][j-1];
            }
        }

        int mx = 0;
        for (int j = 0; j < m[0].length; j++) {
            int tmp = 0;
            for (int i = 0; i < C; i++) {
                if (m[i][j] > 0) tmp++;
            }
            mx = Math.max(mx,tmp);
        }

        System.out.println(mx);
    }
}
