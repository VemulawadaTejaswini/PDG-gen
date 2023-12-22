import java.util.*;

public class Main {
    static int n;
    static int [][] all;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        all = new int[n][n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            Arrays.fill(all[i], -1);
            for (int j = 0; j < a; j++) {
                all[i][sc.nextInt() - 1] = sc.nextInt();
            }
        }
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        System.out.println(search(0, arr));
    }
    
    static int search(int idx, int[] arr) {
        if (idx >= n) {
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        if (arr[idx] != 1) {
            int[] next = (int[])(arr.clone());
            next[idx] = 0;
            ans = search(idx + 1, next);
        }
        if (arr[idx] != 0) {
            int[] next = (int[])(arr.clone());
            next[idx] = 1;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int x = all[idx][i];
                if (x != -1) {
                    if (next[i] != -1 && next[i] != x) {
                        flag = false;
                        break;
                    }
                    next[i] = x;
                }
            }
            if (flag) {
                ans = Math.max(ans, search(idx + 1, next) + 1);
            }
        }
        return ans;
        
    }
}
