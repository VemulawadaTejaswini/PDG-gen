import java.util.*;

public class Main {

    static int[][] d;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = new int[n][2];
        int min= 12;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            d[i][0] = x;
            d[i][1] = x == 0 ? 0 : 24 - x;
            if(x < min) min = x;
        }
        int ans = 0;
        if(23 < n) System.out.println(0);
        else{
            for (int i = 1; i <= min; i++) {
                boolean[] used = new boolean[24];
                used[0] = true;
                if(dfs(used, 0, i)) ans = i;
                else break;
            }
            System.out.println(ans);
        }
        sc.close();

    }

    private static boolean dfs(boolean[] used, int i, int diff) {
        if(i == n) return true;
        for(int a : d[i]){
            if(used[a])continue;
            boolean able = true;
            for (int j = 1; j < diff; j++) {
                int b = 23 < a+j ? a+j - 24 : a+j;
                if(used[b]) {able = false; break;}
                int c = a-j < 0 ? 24 + a-j : a-j;
                if(used[c]) {able = false; break;}
            }
            if(able){
                used[a] = true;
                boolean ret = dfs(used, i+1, diff);
                if(ret) return true;
                else used[a] = false;
            }
        }
        return false;
    }

}
