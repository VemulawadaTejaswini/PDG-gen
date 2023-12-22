import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cnt = new int[10][10];
        for(int i = 1; i < n + 1; ++i) {
            String si = String.valueOf(i);
            int head = (int)(si.charAt(0) - '0');
            int tail = (int)(si.charAt(si.length() - 1) - '0');
            ++cnt[head][tail];
        }
        
        long ans = 0L;
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                ans += 1L * cnt[i][j] * cnt[j][i];
            }
        }
        System.out.println(ans);
    }
}
