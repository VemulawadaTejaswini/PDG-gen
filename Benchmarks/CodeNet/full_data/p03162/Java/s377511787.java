import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        long[][] memo = new long[n][3];
        int diary = -1;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < 3;j++) memo[i][j] = -1;
        }
        System.out.println(dp(n, a, b, c, n - 1, memo, diary));
    }

    private static long dp(int n, int[] a, int[] b, int[] c, int today, long[][] memo, int diary) {
        if(today == -1) return 0;
        else if(diary != -1 && memo[today][diary] != -1) return memo[today][diary];
        else {
            int yesterday = today - 1;
            long maxHappiness = Long.MIN_VALUE;
            long tmpHappiness = Long.MIN_VALUE;
            if(diary != 0) {
                int tmpDiary = 0;
                tmpHappiness = dp(n, a, b, c, yesterday, memo, tmpDiary) + a[today];
                if(maxHappiness < tmpHappiness) maxHappiness = tmpHappiness;
            }
            if(diary != 1) {
                int tmpDiary = 1;
                tmpHappiness = dp(n, a, b, c, yesterday, memo, tmpDiary) + b[today];
                if(maxHappiness < tmpHappiness) maxHappiness = tmpHappiness;
            }
            if(diary != 2) {
                int tmpDiary = 2;
                tmpHappiness = dp(n, a, b, c, yesterday, memo, tmpDiary) + c[today];
                if(maxHappiness < tmpHappiness) maxHappiness = tmpHappiness;
            }
            
            if(diary != -1) memo[today][diary] = maxHappiness;
            return maxHappiness;
        }
    }
}
