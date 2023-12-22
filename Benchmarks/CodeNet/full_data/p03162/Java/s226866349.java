import java.util.*;

class activity{
    int a;
    int b;
    int c;
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<activity> arr = new ArrayList<activity>(n+1);

        for(int i=0;i<n;i++){
            activity ac = new activity();
            ac.a = sc.nextInt();
            ac.b = sc.nextInt();
            ac.c = sc.nextInt();
            arr.add(ac);
        }

        int dp[][] = new int[n+1][3];
        dp[1][0] = arr.get(0).a;
        dp[1][1] = arr.get(0).b;
        dp[1][2] = arr.get(0).c;

        for(int i=2;i<=n;i++){
            dp[i][0] = arr.get(i-1).a + Math.max(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr.get(i-1).b + Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = arr.get(i-1).c + Math.max(dp[i-1][0],dp[i-1][1]);
        }

        System.out.print(Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2])));

    }
}