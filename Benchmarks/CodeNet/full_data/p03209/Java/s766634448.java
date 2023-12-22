import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] all = new long[n+1];
        long[] pate = new long[n+1];
        all[0] = 1;
        pate[0] = 1;
        for(int i = 1; i <= n; i++) {
            all[i] = all[i-1] * 2 + 3;
            pate[i] = pate[i-1] * 2 + 1;
        }
        System.out.println(dfs(n, x, all, pate));
    }
    private static long dfs(int n, long x, long[] all, long[] pate) {
        if(n == 0) return 1;
        long pateCount = 0;
        // bans
        if(x > 0) x--;
        // level n-1
        if(x > 0) {
            if(x >= all[n-1]) {
                x -= all[n-1];
                pateCount += pate[n-1];
            } else {
                pateCount += dfs(n-1, x, all, pate);
                x = 0;
            }
        }
        // pate
        if(x > 0) {
            x--;
            pateCount++;
        }
        // level n-1
        if(x > 0) {
            if(x >= all[n-1]) {
                x -= all[n-1];
                pateCount += pate[n-1];
            } else {
                pateCount += dfs(n-1, x, all, pate);
                x = 0;
            }
        }
        // bans
        if(x > 0) x--;
        return pateCount;
    }
}
