import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Double.compare((double)o1[0]/o1[1], (double)o2[0]/o2[1]);
            }
        };
        Scanner sc = new Scanner(System.in);
        int INF = Integer.MAX_VALUE-500000;
        int N = Integer.parseInt(sc.next());
        int Ma = Integer.parseInt(sc.next());
        int Mb = Integer.parseInt(sc.next());
        int[][] dp = new int[401][401];
        for (int i=0;i<dp.length;i++) {
            for (int j=0;j<dp.length;j++) {
                dp[i][j] = INF;
            }
        }
        dp[0][0]=0;
        for (int k=0;k<N;k++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            for (int i=400;i>=0;i--) {
                for (int j=400;j>=0;j--) {
                    if (dp[i][j]!=INF) {
                        dp[i+a][j+b]=Math.min(dp[i+a][j+b], dp[i][j]+c);
                    }
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));
        // System.out.println(Arrays.toString(dp[1]));
        int x = Ma;
        int y = Mb;
        int ans = INF;
        while(x<400 && y<400) {
            ans = Math.min(ans, dp[x][y]);
            x+=Ma;
            y+=Mb;
        }
        System.out.println(ans);
    }
}