import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        K*=2;
        int[][] black = new int[K][K];
        int[][] white = new int[K][K];
        for (int i=0;i<N;i++) {
            int x = Integer.parseInt(sc.next())%K;
            int y = Integer.parseInt(sc.next())%K;
            char c = sc.next().charAt(0);
            if (c=='B') black[y][x]++;
            if (c=='W') white[y][x]++;
        }

        int[][] ruiseki_b = new int[K+1][K+1];
        int[][] ruiseki_w = new int[K+1][K+1];
        for (int i=0;i<K;i++) {
            for (int j=0;j<K;j++) {
                ruiseki_b[i+1][j+1] = ruiseki_b[i+1][j]+ruiseki_b[i][j+1]-ruiseki_b[i][j]+black[i][j];
                ruiseki_w[i+1][j+1] = ruiseki_w[i+1][j]+ruiseki_w[i][j+1]-ruiseki_w[i][j]+white[i][j];
            }
        }

        int ans = 0;
        for (int i=0;i<K+1;i++) {
            for (int j=0;j<K+1;j++) {
                int b_1 = ruiseki_b[K][K]-ruiseki_b[K][j]-ruiseki_b[i][K]+2*ruiseki_b[i][j];
                int w_1 = ruiseki_w[K][j]+ruiseki_w[i][K]-2*ruiseki_w[i][j];
                ans = Math.max(ans, b_1+w_1);
                // if (b_1+w_1==5) System.out.println("ans_1, i, j: "+i+" "+j);

                int b_2 = ruiseki_b[K][j]+ruiseki_b[i][K]-2*ruiseki_b[i][j];
                int w_2 = ruiseki_w[K][K]-ruiseki_w[K][j]-ruiseki_w[i][K]+2*ruiseki_w[i][j];
                ans = Math.max(ans, b_2+w_2);
                // if (b_2+w_2==5) System.out.println("ans_2, i, j: "+i+" "+j);
            }
        }
        System.out.println(ans);
        // System.out.println(Arrays.deepToString(black));
        // System.out.println(Arrays.deepToString(ruiseki_b));
    }
}