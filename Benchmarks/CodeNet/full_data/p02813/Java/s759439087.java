public class Main {
    private static int n, cnt = 0, x = 0;
    private static int[][] targetSeq = new int[2][10];
    private static int[] vis = new int[10];
    private static int[] tempSeq = new int[10];
    private static int[] ans = new int[2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i = 0;i < 2;i++) {
            for(int j = 0;j < n;j++) {
                targetSeq[i][j] = in.nextInt();
            }
        }
        dfs(0);
        System.out.println(Math.abs(ans[0] - ans[1]));
    }

    private static void dfs(int k) {
        if(x == 2) {
            return;
        }
        if(k == n) {
            cnt++;
            for(int i = 0;i < 2;i++) {
                boolean isOk = true;
                for(int j = 0;j < n;j++) {
                    if(tempSeq[j] != targetSeq[i][j]) {
                        isOk = false;
                        break;
                    }
                }
                if(isOk) {
                    ans[x++] = cnt;
                }
            }
            return;
        }
        for(int i = 1;i <= n;i++) {
            if(vis[i] == 0) {
                vis[i] = 1;
                tempSeq[k] = i;
                dfs(k + 1);
                vis[i] = 0;
            }
        }
    }
}