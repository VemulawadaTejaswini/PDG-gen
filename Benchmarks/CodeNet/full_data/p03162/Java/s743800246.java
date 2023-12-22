import java.util.*;
import java.util.Arrays;

public class Main {
    public static long[][] memo;
    public static long INF = -1;
    public static long[][] point_list;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        memo = new long[N][3];
        for (int i = 0; i<N; i++) {
            Arrays.fill(memo[i], INF);
        }
        //System.out.println(memo[1][1]);
        point_list = new long[N][3];
        for (int i=0; i<N; i++) {
            for (int j=0; j<3; j++){
                point_list[i][j] = sc.nextInt();
            }
        }
        long[] ans_list = tilAns(N-1);
        long ans = INF;
        for (int i=0; i<3; i++){
            if (ans_list[i] > ans) {
                ans = ans_list[i];
            }
        }
        System.out.println(ans);
        //Sy)stem.out.println(point_list[0][1]);
        
    }
    public static long[] tilAns(int n) {
        if (memo[n][0] != INF) {
            return memo[n];
        }
        if (n == 0) {
            for (int i = 0; i<3; i++) {
                memo[0][i] = point_list[0][i];
            }
            return memo[0];
        }
        
        memo[n][0] = Math.max(tilAns(n-1)[1] + point_list[n][0], tilAns(n-1)[2] + point_list[n][0]);
        memo[n][1] = Math.max(tilAns(n-1)[0] + point_list[n][1], tilAns(n-1)[2] + point_list[n][1]);
        memo[n][2] = Math.max(tilAns(n-1)[0] + point_list[n][2], tilAns(n-1)[1] + point_list[n][2]);
        return memo[n];
    }
}
